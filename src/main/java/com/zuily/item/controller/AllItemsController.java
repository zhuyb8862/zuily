package com.zuily.item.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zuily.item.bean.Items;
import com.zuily.item.service.ItemServices;

@Controller
@RequestMapping("/pages")
public class AllItemsController {
	@Autowired
	private ItemServices itemServie;

	/**
	 * 上架
	 * 
	 * @param id
	 * @return
	 */
	@RequestMapping("/upLine")
	public ModelAndView upLineItem(int id) {
		itemServie.upLineItem(id);
		List<Items> all = null;

		try {
			all = itemServie.getItems();
		} catch (Exception e) {
			e.printStackTrace();
		}

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("items", all);
		modelAndView.setViewName("allItems/allItems");
		return modelAndView;

	}

	@RequestMapping("/offLine")
	public ModelAndView offLineItem(int id) {
		itemServie.offLineItem(id);
		List<Items> all = null;

		try {
			all = itemServie.getItems();
		} catch (Exception e) {
			e.printStackTrace();
		}

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("items", all);
		modelAndView.setViewName("allItems/allItems");
		return modelAndView;

	}

	@RequestMapping("/AllItem")
	public ModelAndView allItems() {
		List<Items> all = null;

		try {
			all = itemServie.getItems();
		} catch (Exception e) {
			e.printStackTrace();
		}

		ModelAndView modelAndView = new ModelAndView();

		modelAndView.addObject("items", all);
		modelAndView.setViewName("allItems/allItems");
		return modelAndView;

	}

}
