package com.zuily.item.service;

import java.util.List;

import com.zuily.item.bean.Jtime;

public interface TimeService {
	 public void insert(Jtime jtime)throws Exception;

	public List<Jtime> selectByIid(int id);

}
