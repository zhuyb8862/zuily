package com.zuily.item.controller;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.zuily.item.bean.Feeexclude;
import com.zuily.item.bean.Feeinclude;
import com.zuily.item.bean.Items;
import com.zuily.item.bean.Jplan;
import com.zuily.item.bean.Jtime;
import com.zuily.item.bean.Notice;
import com.zuily.item.bean.Pics;
import com.zuily.item.service.FeeService;
import com.zuily.item.service.ItemServices;
import com.zuily.item.service.JplanService;
import com.zuily.item.service.NoticeService;
import com.zuily.item.service.PicService;
import com.zuily.item.service.TimeService;

@Controller
public class PublishItemController {

	@Autowired
	private ItemServices itemService;
	@Autowired
	private PicService picService;
	@Autowired
	private TimeService timeService;
	@Autowired
	private JplanService jplanService;
	@Autowired
	private FeeService feeService;
	@Autowired
	private NoticeService noticeService;

	@RequestMapping("/item/publishItem")
	public String publisItem(HttpServletRequest request,
			@RequestParam MultipartFile[] pic) {

		Map<String, String[]> parameterMap = request.getParameterMap();

		String[] iname = parameterMap.get("iname");
		String[] type = parameterMap.get("type");
		String[] fee = parameterMap.get("fee");
		String[] destination = parameterMap.get("destination");
		String[] tel = parameterMap.get("tel");
		String[] srcUrl = parameterMap.get("srcUrl");
		String[] iDiscr = parameterMap.get("iDiscr");
		Items items = new Items();
		items.setIname(iname[0]);
		items.setType(type[0]);
		
		double price = 0;

		if (!fee[0].isEmpty()) {
			price = Double.valueOf(fee[0]);
		}
		items.setPrice(price);
		items.setDestination(destination[0]);
		items.setPhone(tel[0]);
		items.setResourceurl(srcUrl[0]);
		items.setItembrief(iDiscr[0]);
		try {
			
	
		for (MultipartFile pics : pic) {
			String realpath = request.getSession().getServletContext()
					.getRealPath("/");
			String originalFilename = pics.getOriginalFilename();
			String[] split = originalFilename.split("\\.");
			String pid = new SimpleDateFormat("yyyyMMddHHmmssSSS")
					.format(new Date()) + "f";
			String url = realpath + "/upLoad/ItemPics/" + pid + "." + split[1];
			pics.transferTo(new File(url));
			System.out.println(url);
			items.setShowpic("/upLoad/ItemPics/" + pid + "." + split[1]);
			break;
		}
		} catch (Exception e) {
		e.printStackTrace();
		}
		// 状态 0未审核 1下线 2上线
		 items.setState((byte) 0);
		 
		try {
			itemService.insert(items);

		} catch (Exception e) {
			e.printStackTrace();
		}

		// 插入图片
		this.insertPics(pic, request, items.getIid());
		// 插入时间
		this.insertTime(parameterMap, items.getIid());
		// 插入行程
		this.insertJplan(parameterMap, items.getIid());
		// 插入费用包含
		this.insertIncludeFees(parameterMap, items.getIid());
		// 插入费不包含
		this.insertExcludeFees(parameterMap, items.getIid());
		// 插入注意事项
		this.insertNotices(parameterMap, items.getIid());
		return "allItems/allItems";
	}

	public void insertTime(Map<String, String[]> parameterMap, Integer iid) {
		// 最多添加四组时间
		// time1 eTime1
		List<Jtime> timeList = new ArrayList<Jtime>();
		Jtime stratime = null;
		Jtime endtime = null;
		for (int i = 1; i <= 4; i++) {
			String[] star = parameterMap.get("time" + i);
			String[] end = parameterMap.get("eTime" + i);
			if ("开始时间".equals(star[0]) || "结束时间".equals(end[0])) {
				continue;
			}
			stratime = new Jtime();
			String tid = new SimpleDateFormat("yyyyMMddHHmmssSSS")
					.format(new Date()) + i + "s";
			stratime.setTid(tid);
			stratime.setIid(iid);
			stratime.setTime(star[0]);
			stratime.setRelate("" + i);
			endtime = new Jtime();
			String eid = new SimpleDateFormat("yyyyMMddHHmmssSSS")
					.format(new Date()) + i + "e";
			endtime.setTid(eid);
			endtime.setIid(iid);
			endtime.setTime(end[0]);
			endtime.setRelate("" + i);

			timeList.add(stratime);

			timeList.add(endtime);

		}
		try {
			for (Jtime jtime : timeList) {

				timeService.insert(jtime);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/**
	 * 插入图片
	 * 
	 * @param PICS
	 * @param request
	 * @param iid
	 */
	public String insertPics(MultipartFile[] PICS, HttpServletRequest request,
			Integer iid) {
		String realpath = request.getSession().getServletContext()
				.getRealPath("/");

		List<Pics> picList = null;
		String url = null;
		try {
			picList = new ArrayList<Pics>();
			int i = 0;
			MultipartFile multipartFile = null;
			for (int p=1,j=PICS.length; p<j; p++) {
				 multipartFile = PICS[p];
				i++;
				Pics pics = new Pics();
				String originalFilename = multipartFile.getOriginalFilename();
				String[] split = originalFilename.split("\\.");
				String pid = new SimpleDateFormat("yyyyMMddHHmmssSSS")
						.format(new Date()) + i;
				url = realpath + "/upLoad/ItemPics/" + pid + "." + split[1];
				multipartFile.transferTo(new File(url));
				pics.setIid(iid);
				pics.setPid(pid);
				pics.setUrl("upLoad/ItemPics/" + pid + "." + split[1]);
				picList.add(pics);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			for (Pics pic1 : picList) {

				picService.insert(pic1);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return url;
	}

	/**
	 * 插入行程描述
	 */
	public void insertJplan(Map<String, String[]> parameterMap, Integer iid) {
		// 获取次数
		String[] strings = parameterMap.get("jourtimes");
		int index = Integer.valueOf(strings[0]);
		List<Jplan> jplanList = new ArrayList<Jplan>();
		Jplan jplan = null;
		for (int i = 1; i <= index; i++) {
			String jid = new SimpleDateFormat("yyyyMMddHHmmssSSS")
					.format(new Date()) + i;
			jplan = new Jplan();
			String Jtitle = "Jtitle" + i;
			String Jdescr = "Jdescr" + i;

			jplan.setIid(iid);
			jplan.setPid(jid);
			jplan.setTitle(parameterMap.get(Jtitle)[0]);
			jplan.setDetail(parameterMap.get(Jdescr)[0]);
			jplanList.add(jplan);
		}
		try {
			for (Jplan jplan1 : jplanList) {

				jplanService.insert(jplan1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// 包含费用
	public void insertIncludeFees(Map<String, String[]> parameterMap,
			Integer iid) {
		// 获取次数
		String[] strings = parameterMap.get("includFeetimes");
		int index = Integer.valueOf(strings[0]);
		List<Feeinclude> FeeincludeList = new ArrayList<Feeinclude>();
		Feeinclude Feeinclude = null;
		String name = "feeinclud";
		for (int i = 1; i <= index; i++) {
			String fid = new SimpleDateFormat("yyyyMMddHHmmssSSS")
					.format(new Date()) + iid + i;
			Feeinclude = new Feeinclude();

			Feeinclude.setIid(iid);
			Feeinclude.setId(fid);
			Feeinclude.setDescri(parameterMap.get(name + i)[0]);

			FeeincludeList.add(Feeinclude);
		}
		try {
			for (Feeinclude feeInclud : FeeincludeList) {

				feeService.insertIncludeFee(feeInclud);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void insertExcludeFees(Map<String, String[]> parameterMap,
			Integer iid) {
		// TODO
		// excludFeetimes feeExclud
		// 获取次数
		String[] strings = parameterMap.get("excludFeetimes");
		int index = Integer.valueOf(strings[0]);
		List<Feeexclude> FeeExcludeList = new ArrayList<Feeexclude>();
		Feeexclude FeeExclude = null;
		String name = "feeExclud";
		for (int i = 1; i <= index; i++) {
			String fid = new SimpleDateFormat("yyyyMMddHHmmssSSS")
					.format(new Date()) + iid + i;
			FeeExclude = new Feeexclude();

			FeeExclude.setIid(iid);
			FeeExclude.setId(fid);
			FeeExclude.setDescri(parameterMap.get(name + i)[0]);

			FeeExcludeList.add(FeeExclude);
		}
		try {
			for (Feeexclude feeexlud : FeeExcludeList) {

				feeService.insertExcludeFee(feeexlud);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void insertNotices(Map<String, String[]> parameterMap, Integer iid) {
		// TODO
		// noticetimes
		String[] strings = parameterMap.get("noticetimes");
		int index = Integer.valueOf(strings[0]);
		List<Notice> NoticeList = new ArrayList<Notice>();
		Notice notice = null;
		String name = "notice";
		for (int i = 1; i <= index; i++) {
			String nid = new SimpleDateFormat("yyyyMMddHHmmssSSS")
					.format(new Date()) + iid + i;
			notice = new Notice();

			notice.setIid(iid);
			notice.setNid(nid);
			notice.setDecr(parameterMap.get(name + i)[0]);

			NoticeList.add(notice);
		}
		try {
			for (Notice notice1 : NoticeList) {

				noticeService.insertNotice(notice1);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
