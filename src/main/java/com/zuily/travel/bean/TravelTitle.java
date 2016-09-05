package com.zuily.travel.bean;

import java.util.List;

public class TravelTitle {

	private String title;

	private String des;
	private List<String> titlePics;


	public String getTitle() {
		return title;
	}

	public List<String> getTitlePics() {
		return titlePics;
	}

	public void setTitlePics(List<String> titlePics) {
		this.titlePics = titlePics;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDes() {
		return des;
	}

	public void setDes(String des) {
		this.des = des;
	}

	
}
