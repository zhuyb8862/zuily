package com.zuily.banner.bean;

import java.io.Serializable;
import java.util.List;

public class BannerBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * banner 首页 的图片
	 */
	private List<BannerBase> banners;

	public List<BannerBase> getBanners() {
		return banners;
	}

	public void setBanners(List<BannerBase> banners) {
		this.banners = banners;
	}

}
