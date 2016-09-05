package com.zuily.travel.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zuily.travel.bean.TravelPics;
import com.zuily.travel.bean.TravelPicsExample;
import com.zuily.travel.bean.TravelPicsExample.Criteria;
import com.zuily.travel.dao.TravelPicsMapper;
import com.zuily.travel.service.TravelPicService;

@Transactional
@Service
public class TravelPicServiceimpl implements TravelPicService {
	@Autowired
	private TravelPicsMapper TravelPicDao;

	@Override
	public void insert(TravelPics pic) {

		TravelPicDao.insert(pic);
	}

	@Override
	public List<TravelPics> selectByDesId(Integer id) {

		TravelPicsExample example = new TravelPicsExample();
		Criteria andIdEqualTo = example.createCriteria().andIdEqualTo(id);
		example.or(andIdEqualTo);

		List<TravelPics> selectByExample = TravelPicDao
				.selectByExample(example);
		return selectByExample;
	}

	@Override
	public void insertPicList(List<TravelPics> picList) {
		for (TravelPics travelPics : picList) {
			TravelPicDao.insertSelective(travelPics);

		}

	}

	@Override
	public List<TravelPics> getAll() {
		
		TravelPicsExample example = new TravelPicsExample();
		Criteria andPidIsNotNull = example.createCriteria().andPidIsNotNull();
		example.or(andPidIsNotNull);
		return TravelPicDao.selectByExample(example);
		 
	}

}
