package com.zuily.item.service;

import java.util.List;

import com.zuily.item.bean.Items;

public interface ItemServices {
	public void insert( Items items)throws Exception;
	public List<Items> getItems()throws Exception;
	public void upLineItem(int id);
	void offLineItem(int id);
	public Items selectById(int id);
	public void updateBid(int[] itemid, Integer bid);

}
