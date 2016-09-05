package com.zuily.travel.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.zuily.travel.bean.Travel;
import com.zuily.travel.bean.TravelDes;
import com.zuily.travel.bean.TravelPics;
import com.zuily.travel.bean.TravelTitle;
import com.zuily.travel.service.TravelDesService;
import com.zuily.travel.service.TravelPicService;
import com.zuily.travel.service.TravelService;

@Controller
@RequestMapping("/travel")
public class TravelController {
	@Autowired
	private TravelPicService travelPicService;
	@Autowired
	private TravelService travelService;
	@Autowired
	private TravelDesService traveldesService;

	@RequestMapping("/toaddTitle")
	public ModelAndView toaddTitle(String tid) {

		ModelAndView andView = new ModelAndView();
		andView.addObject("tid", tid);
		andView.setViewName("/travel/addTitle");
		return andView;

	}

	/**
	 * 添加描述
	 * 
	 * @param travelpic
	 * @param request
	 * @return
	 */
	@RequestMapping("/addTitle")
	public String addTitle(@RequestParam MultipartFile[] travelpic,
			HttpServletRequest request) {
		String tid = request.getParameter("tid");
		String title = request.getParameter("title");
		String des = request.getParameter("des");
		TravelDes travelDes = new TravelDes();
		travelDes.setTid(Integer.valueOf(tid));
		travelDes.setTitle(title);
		travelDes.setDes(des);
		traveldesService.insert(travelDes);
		Integer id = travelDes.getId();
		// 上传图片

		List<TravelPics> picList = new ArrayList<TravelPics>();
		TravelPics travelPics = null;

		int picnum = 0;
		for (MultipartFile pic : travelpic) {

			if (pic.getSize() > 1) {
				String realPath = request.getSession().getServletContext()
						.getRealPath("/");
				System.out.println("真是路径是：" + realPath);
				String originalFilename = pic.getOriginalFilename();
				String[] split = originalFilename.split("\\.");
				String pname = new SimpleDateFormat("yyyyMMddHHmmssSSS")
						.format(new Date()) + 1;
				String url = realPath + "upLoad/travel/" + pname + picnum + "."
						+ split[1];

				try {
					pic.transferTo(new File(url));
				} catch (IllegalStateException | IOException e) {
					e.printStackTrace();
				}
				travelPics = new TravelPics();
				travelPics.setId(id);
				travelPics.setPicurl("upLoad/travel/" + pname + picnum + "."
						+ split[1]);
				picList.add(travelPics);
			}
			picnum++;
		}
		travelPicService.insertPicList(picList);

		return "redirect:/travel/detail?tid=" + tid;
	}

	/**
	 * 根据travel id 查询详情
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/detail")
	public ModelAndView TravelDetail(int tid) {
		Travel travel = travelService.selectById(tid);

		List<TravelDes> TravelDesList = traveldesService.selectByTid(tid);
		List<TravelTitle> TravelTitles = new ArrayList<TravelTitle>();
		TravelTitle title = null;
		for (TravelDes travelDes : TravelDesList) {
			title = new TravelTitle();
			title.setTitle(travelDes.getTitle());
			title.setDes(travelDes.getDes());
			List<TravelPics> PicList = travelPicService.selectByDesId(travelDes
					.getId());
			List<String> picurls = new ArrayList<String>();
			for (TravelPics travelPics : PicList) {
				picurls.add(travelPics.getPicurl());
			}
			title.setTitlePics(picurls);
			TravelTitles.add(title);
		}

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("travel", travel);
		modelAndView.addObject("TravelTitles", TravelTitles);
		modelAndView.setViewName("/travel/travelDetail");
		return modelAndView;

	}

	@RequestMapping("/AllTravel")
	public ModelAndView allTravel() {

		List<Travel> travels = travelService.getAll();

		ModelAndView andView = new ModelAndView();
		andView.addObject("travels", travels);
		andView.setViewName("/travel/allTravel");
		return andView;
	}

	@RequestMapping("/publishTravel")
	public String publishTravel(@RequestParam MultipartFile[] userpic,
			HttpServletRequest request, HttpServletResponse response) {

		String tname = request.getParameter("tname");
		String type = request.getParameter("type");
		String fee = "";
		if (request.getParameter("free") == "option1"
				|| "option1".equals(request.getParameter("free"))) {
			fee = request.getParameter("fee");

		} else {
			fee = "";
		}
		String destination = request.getParameter("destination");

		String starttime = request.getParameter("starttime");
		String daynum = request.getParameter("daynum");
		String username = request.getParameter("username");

		Travel travel = new Travel();
		travel.setTname(tname);
		travel.setType(type);

		if (fee != "") {

			travel.setFee(Double.valueOf(fee));
		} else {
			travel.setFee(0.0);
		}

		travel.setDestination(destination);
		travel.setStarttime(starttime);
		travel.setDaynum(Byte.valueOf(daynum));
		travel.setUsername(username);

		String realPath = request.getSession().getServletContext()
				.getRealPath("/");
		try {

			int i = 1;

			for (MultipartFile multipartFile : userpic) {

				System.out.println("真是路径是：" + realPath);
				String originalFilename = multipartFile.getOriginalFilename();
				String[] split = originalFilename.split("\\.");
				String pname = new SimpleDateFormat("yyyyMMddHHmmssSSS")
						.format(new Date()) + 1;
				String url = realPath + "upLoad/user/" + pname + username + "."
						+ split[1];
				multipartFile.transferTo(new File(url));

				if (i == 1) {
					travel.setUserpicurl("upLoad/user/" + pname + username
							+ "." + split[1]);
				}else{
					travel.setShowpic("upLoad/user/" + pname + username
							+ "." + split[1]);
					
				}
				i++;

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		travel.setState((byte) 0);
		travelService.insert(travel);
		
		return "redirect：/travel/AllTravel";
	}

}
