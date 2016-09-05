package com.zuily.banner.bean;

import java.io.Serializable;

public class BannerBase implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int bid;
	private String name;
	private String picurl;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicurl() {
		return picurl;
	}

	public void setPicurl(String picurl) {
		this.picurl = picurl;
	}
}
