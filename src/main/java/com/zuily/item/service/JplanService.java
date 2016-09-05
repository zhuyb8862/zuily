package com.zuily.item.service;

import java.util.List;

import com.zuily.item.bean.Jplan;

public interface JplanService {
	public void insert(Jplan jplan)throws Exception;

	public List<Jplan> selectByIid(int id);

}
