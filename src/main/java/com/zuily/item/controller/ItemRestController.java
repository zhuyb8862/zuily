package com.zuily.item.controller;

import java.util.List;

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
import com.zuily.item.bean.ItemDetal;
import com.zuily.item.service.FeeService;
import com.zuily.item.service.ItemServices;
import com.zuily.item.service.JplanService;
import com.zuily.item.service.NoticeService;
import com.zuily.item.service.PicService;
import com.zuily.item.service.TimeService;

@RestController
public class ItemRestController {
	@Autowired
	private com.zuily.item.service.ItemServices itemService;
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

	/**
	 * 获取详细信息
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/item/{id}")
	public ItemDetal itemDetal(@PathVariable("id") int id) {
		Items item = itemService.selectById(id);
		List<Pics> pics = picService.selelctByIid(id);
		List<Jtime> times = timeService.selectByIid(id);
		List<Jplan> plans = jplanService.selectByIid(id);
		List<Feeexclude> feeex = feeService.selectByIid(id);
		List<Feeinclude> feein = feeService.selectFeeinByIid(id);
		List<Notice> notice = noticeService.selectById(id);
		ItemDetal detal = new ItemDetal();

		detal.setItem(item);
		detal.setPics(pics);
		detal.setTimes(times);
		detal.setPlans(plans);
		detal.setFeeexs(feeex);
		detal.setFeeins(feein);
		detal.setNotices(notice);
		return detal;

	}

}
