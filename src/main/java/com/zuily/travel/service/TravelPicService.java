package com.zuily.travel.service;

import java.util.List;

import com.zuily.travel.bean.TravelPics;

public interface TravelPicService {
	public void insert(TravelPics pic);

	public List<TravelPics> selectByDesId(Integer id);

	public void insertPicList(List<TravelPics> picList);

	public List<TravelPics> getAll();

}
