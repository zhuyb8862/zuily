package com.zuily.rest.bean;

import java.util.List;

import com.zuily.item.bean.Items;
import com.zuily.travel.bean.Travel;

public class FirstPage {
	private List<String> showpics;
	private List<Travel> travels;
	private List<Items> items;

	public List<String> getShowpics() {
		return showpics;
	}

	public void setShowpics(List<String> showpics) {
		this.showpics = showpics;
	}

	public List<Travel> getTravels() {
		return travels;
	}

	public void setTravels(List<Travel> travels) {
		this.travels = travels;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

}
