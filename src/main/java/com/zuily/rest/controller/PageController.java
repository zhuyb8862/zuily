package com.zuily.rest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zuily.item.bean.Items;
import com.zuily.item.service.ItemServices;
import com.zuily.rest.bean.FirstPage;
import com.zuily.travel.bean.Travel;
import com.zuily.travel.service.TravelService;

@RestController
public class PageController {
	@Autowired
	private TravelService travelService;
	
	@Autowired
	private ItemServices itemService;

	@RequestMapping("/page/first")
	public FirstPage getFirstPage() {
		FirstPage fp = new FirstPage();

		List<Travel> Travels = travelService.getAll();
		fp.setTravels(Travels);

		List<String> showpics = new ArrayList<String>();
		for (Travel travel : Travels) {
			showpics.add(travel.getShowpic());
		}
		fp.setShowpics(showpics);
		try {
			List<Items> items = itemService.getItems();
			fp.setItems(items);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return fp;

	}

}
