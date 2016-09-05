package com.zuily.banner.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zuily.banner.bean.Banner;
import com.zuily.banner.bean.BannerBase;
import com.zuily.banner.bean.BannerBean;
import com.zuily.banner.bean.Bannerpic;
import com.zuily.banner.service.BannerPicService;
import com.zuily.banner.service.BannerService;

@RestController
public class RestBannerController {
	@Autowired
	private BannerService bannerservice;
	@Autowired
	private BannerPicService bannePicService;

	@RequestMapping("/ibanner/pics")
	public BannerBean getBanner() {
		BannerBean bannerBean = new BannerBean();
		List<BannerBase> bases = new ArrayList<BannerBase>();
		List<Banner> bannerList = bannerservice.getAll();

		BannerBase bannerBase = null;
		for (Banner banner : bannerList) {
			bannerBase = new BannerBase();
			bannerBase.setBid(banner.getBid());
			bannerBase.setName(banner.getBtitle());
			Bannerpic bp = bannePicService.findByBid(banner.getBid());
			bannerBase.setPicurl(bp.getUrl());
			bases.add(bannerBase);
		}
		bannerBean.setBanners(bases);
		return bannerBean;

	}

}
