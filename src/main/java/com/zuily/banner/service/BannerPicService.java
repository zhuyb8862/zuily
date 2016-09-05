package com.zuily.banner.service;

import java.util.List;

import com.zuily.banner.bean.Banner;
import com.zuily.banner.bean.Bannerpic;

public interface BannerPicService {
	public void insert(List<Bannerpic> bannerpiclist);

	void insert(Bannerpic bannerpic);

	public Bannerpic findByBid(Integer bid);



}
