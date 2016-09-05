package com.zuily.item.service;

import java.util.List;

import com.zuily.item.bean.Pics;

public interface PicService {
	public void insert(Pics pic)throws Exception;

	public List<Pics> selelctByIid(int id);

}
