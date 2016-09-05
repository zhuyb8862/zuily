package com.zuily.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zuily.travel.bean.TravelDes;
import com.zuily.travel.bean.TravelDesExample;
import com.zuily.travel.bean.TravelDesExample.Criteria;
import com.zuily.travel.dao.TravelDesMapper;
import com.zuily.travel.service.TravelDesService;

@Service
@Transactional
public class TravelDesServiceImpl implements TravelDesService {
	@Autowired
	private TravelDesMapper travelDesDao;

	@Override
	public void insert(TravelDes travelDes) {
		travelDesDao.insert(travelDes);
	}

	@Override
	public TravelDes selectByID(int id) {
		TravelDes travel = travelDesDao.selectByPrimaryKey(id);
		return travel;
	}

	@Override
	public List<TravelDes> selectByTid(int tid) {
		TravelDesExample example = new TravelDesExample();
		Criteria andTidEqualTo = example.createCriteria().andTidEqualTo(tid);
		example.or(andTidEqualTo);
		List<TravelDes> selectByExample = travelDesDao.selectByExample(example);
		return selectByExample;
	}

	@Override
	public List<TravelDes> getAll() {
		TravelDesExample desExample = new TravelDesExample();
		
		Criteria andDesIsNotNull = desExample.createCriteria().andDesIsNotNull();
		desExample.or(andDesIsNotNull);
		
		List<TravelDes> travelDesList = travelDesDao.selectByExample(desExample);	
		
		
		return travelDesList;
	}

}
