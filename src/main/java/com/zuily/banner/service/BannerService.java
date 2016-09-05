package com.zuily.banner.service;

import java.util.List;

import com.zuily.banner.bean.Banner;

public interface BannerService {
	public void insert(Banner banner);

	public List<Banner> getAll();

	public void upline(int id);

	public void offline(int id);

}
