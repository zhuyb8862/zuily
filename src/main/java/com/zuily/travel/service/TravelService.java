package com.zuily.travel.service;

import java.util.List;

import com.zuily.travel.bean.Travel;

public interface TravelService {
	public void insert(Travel travel);

	public List<Travel> getAll();

	public Travel selectById(int id);

}
