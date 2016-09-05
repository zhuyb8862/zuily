package com.zuily.common.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Route {
	@RequestMapping("/route/publishItem")
	public String publishItem() {
		return "allItems/pulishItems";
	}

}
