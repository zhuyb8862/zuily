package com.zuily.rest.controller;

import java.util.List;

import javax.ws.rs.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
import com.zuily.rest.bean.ItemDetail;

@RestController
public class ItemController {
	@Autowired
	private ItemServices itemService;
	@Autowired
	private FeeService feeService;
	@Autowired
	private JplanService jPlanService;
	@Autowired
	private NoticeService notieService;
	@Autowired
	private PicService picService;
	@Autowired
	private TimeService timeService;

	@RequestMapping("item/detal/{id}")
	public ItemDetail itemDel(@PathVariable("id") int id) {
	//	Integer id = Integer.getInteger(sid);
		ItemDetail detail = new ItemDetail();
		Items item = itemService.selectById(id);
		if (item == null) {
			detail.setErrorMessage("获取详情出错");
			return detail;
		}
		detail.setItem(item);
		// 获取费用信息
		List<Feeexclude> feeexclu = feeService.selectByIid(id);
		if (feeexclu == null) {
			detail.setErrorMessage("获取费用信息出错");
			return detail;
		}
		List<Feeinclude> feeinclu = feeService.selectFeeinByIid(id);
		if (feeinclu == null) {
			detail.setErrorMessage("获取费用信息出错");
			return detail;
		}
		detail.setFexclu(feeexclu);

		detail.setFeinclu(feeinclu);
		// 获取计划信息
		List<Jplan> planList = jPlanService.selectByIid(id);
		if (planList == null) {
			detail.setErrorMessage("获取计划信息出错");
			return detail;
		}

		detail.setPlans(planList);
		// 获取须知信息
		List<Notice> noticeList = notieService.selectById(id);

		if (noticeList == null) {
			detail.setErrorMessage("获取须知信息出错");
			return detail;
		}

		detail.setNotices(noticeList);
		// 获取图片信息
		List<Pics> picList = picService.selelctByIid(id);
		detail.setPics(picList);

		if (picList == null) {
			detail.setErrorMessage("获取图片信息出错");
			return detail;
		}
		// 获取时间信息
		List<Jtime> timeList = timeService.selectByIid(id);
		if (timeList == null) {
			detail.setErrorMessage("获取时间信息出错");
			return detail;
		}

		detail.setTimes(timeList);

		return detail;

	}

}
