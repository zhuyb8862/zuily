package com.zuily.item.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zuily.item.bean.Items;
import com.zuily.item.bean.ItemsExample;
import com.zuily.item.bean.ItemsExample.Criteria;
import com.zuily.item.dao.ItemsMapper;
import com.zuily.item.service.ItemServices;

@Service
@Transactional
public class ItemServiceImpl implements ItemServices {
	@Autowired
	private ItemsMapper itemsDao;

	public void insert(Items items) throws Exception {
		itemsDao.insert(items);

		System.out.println("service====" + items.getIid());

	}

	@Override
	public List<Items> getItems() throws Exception {
		ItemsExample example = new ItemsExample();
		Criteria andIidIsNotNull = example.createCriteria().andIidIsNotNull();
		example.or(andIidIsNotNull);

		List<Items> itemList = itemsDao.selectByExample(example);

		return itemList;
	}

	// 上线
	@Override
	public void upLineItem(int id) {
		
		Items record = itemsDao.selectByPrimaryKey(id);
		record.setState((byte) 1);
		itemsDao.updateByPrimaryKey(record);

	}

	// 下线
	@Override
	public void offLineItem(int id) {
		Items record = itemsDao.selectByPrimaryKey(id);
		record.setState((byte) 2);
		itemsDao.updateByPrimaryKey(record);

	}

	@Override
	public Items selectById(int id) {
		Items item = itemsDao.selectByPrimaryKey(id);
		return item;
		
	}

	@Override
	public void updateBid(int[] itemid, Integer bid) {
		for (int i : itemid) {
			
			Items record = itemsDao.selectByPrimaryKey(i);
			record.setBid(bid);
			itemsDao.updateByPrimaryKey(record);
			
		}
		
		
	}
}
