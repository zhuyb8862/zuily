package com.zuily.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuily.travel.bean.Travel;
import com.zuily.travel.bean.TravelExample;
import com.zuily.travel.bean.TravelExample.Criteria;
import com.zuily.travel.dao.TravelMapper;
import com.zuily.travel.service.TravelService;

@Service
public class TravelServiceImpl implements TravelService {
	@Autowired
	private TravelMapper travelDao;

	@Override
	public void insert(Travel travel) {

		travelDao.insert(travel);
	}

	@Override
	public List<Travel> getAll() {

		TravelExample example = new TravelExample();
		Criteria andTidIsNotNull = example.createCriteria().andTidIsNotNull();
		example.or(andTidIsNotNull);
		List<Travel> selectByExample = travelDao.selectByExample(example);
		return selectByExample;
	}

	@Override
	public Travel selectById(int id) {
		Travel selectByPrimaryKey = travelDao.selectByPrimaryKey(id);
		return selectByPrimaryKey;
	}

}
