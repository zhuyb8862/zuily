package com.zuily.travel.service;

import java.util.List;

import com.zuily.travel.bean.TravelDes;

public interface TravelDesService {
	public void insert(TravelDes travelDes);

	public TravelDes selectByID(int id);
	 
	public List<TravelDes> selectByTid(int tid);

	public List<TravelDes> getAll();

	
}
