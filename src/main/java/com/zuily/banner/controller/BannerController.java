package com.zuily.banner.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.zuily.banner.bean.Banner;
import com.zuily.banner.bean.Bannerpic;
import com.zuily.banner.service.BannerPicService;
import com.zuily.banner.service.BannerService;
import com.zuily.item.service.ItemServices;

@Controller
@RequestMapping("/banner")
public class BannerController {

	@Autowired
	private ItemServices itemService;
	@Autowired
	private BannerService bannerservice;
	@Autowired
	private BannerPicService bannePicService;

	@RequestMapping("/addBnner")
	public String adddBanner(MultipartFile pic,
			@RequestParam MultipartFile[] pics, HttpServletRequest request,
			String bname, String bdsc, int[] itemid) {

		Banner banner = new Banner();
		banner.setBtitle(bname);
		banner.setBdsc(bdsc);
		banner.setState((byte) 0);
		bannerservice.insert(banner);

		// 更新items

		itemService.updateBid(itemid, banner.getBid());

		List<Bannerpic> picList = new ArrayList<Bannerpic>();
		Bannerpic bannerpic = null;
		String realPath = request.getSession().getServletContext()
				.getRealPath("/");
		String originalFilename = pic.getOriginalFilename();
		String[] split = originalFilename.split("\\.");
		String pname = new SimpleDateFormat("yyyyMMddHHmmssSSS")
				.format(new Date()) + 1;
		String url = realPath + "upLoad/banner/" + pname + "." + split[1];
		bannerpic = new Bannerpic();
		bannerpic.setBid(banner.getBid());
		bannerpic.setType((byte) 1);
		bannerpic.setUrl("upLoad/banner/" + pname + "." + split[1]);
		picList.add(bannerpic);
		try {
			pic.transferTo(new File(url));
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}

		try {
			for (MultipartFile p : pics) {
				bannerpic = new Bannerpic();
				String pname2 = new SimpleDateFormat("yyyyMMddHHmmssSSS")
						.format(new Date()) + 2;
				String url2 = realPath + "upLoad/banner/" + pname2 + "."
						+ split[1];
				
				p.transferTo(new File(url2));
				bannerpic.setBid(banner.getBid());
				bannerpic.setType((byte) 2);
				bannerpic.setUrl("upLoad/banner/" + pname2 + "."
						+ split[1]);
				picList.add(bannerpic);
			}
		} catch (IllegalStateException | IOException e) {
			e.printStackTrace();
		}
		bannePicService.insert(picList);
		return "banner/banner";

	}

	@RequestMapping("/AllBanner")
	public ModelAndView getAllBanner() {
		ModelAndView modelAndView = new ModelAndView();

		List<Banner> banners = bannerservice.getAll();
		/*
		 * for (Banner banner : banners) {
		 * System.out.println(banner.toString()); }
		 */
		modelAndView.addObject("blist", banners);
		modelAndView.setViewName("banner/AllBanner");
		return modelAndView;

	}
@RequestMapping("upLine")
	public ModelAndView upline( int id) {
		ModelAndView modelAndView = new ModelAndView();
		bannerservice.upline(id);
		
		List<Banner> banners = bannerservice.getAll();
		/*
		 * for (Banner banner : banners) {
		 * System.out.println(banner.toString()); }
		 */
		modelAndView.addObject("blist", banners);
		modelAndView.setViewName("banner/AllBanner");
		return modelAndView;

	}
	
@RequestMapping("offLine")
	public ModelAndView offline( int id) {
		ModelAndView modelAndView = new ModelAndView();
		bannerservice.offline(id);
		
		List<Banner> banners = bannerservice.getAll();
		/*
		 * for (Banner banner : banners) {
		 * System.out.println(banner.toString()); }
		 */
		modelAndView.addObject("blist", banners);
		modelAndView.setViewName("banner/AllBanner");
		return modelAndView;

	}

}
