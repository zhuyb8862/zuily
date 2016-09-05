package com.zuily.item.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zuily.item.bean.Pics;
import com.zuily.item.bean.PicsExample;
import com.zuily.item.bean.PicsExample.Criteria;
import com.zuily.item.dao.PicsMapper;
import com.zuily.item.service.PicService;

@Transactional
@Service
public class PicServiceImpl implements PicService {
	@Autowired
	private PicsMapper picDao;

	@Override
	public void insert(Pics pic) throws Exception {
		picDao.insert(pic);
	}

	@Override
	public List<Pics> selelctByIid(int id) {
		PicsExample example = new PicsExample();
		Criteria andIidEqualTo = example.createCriteria().andIidEqualTo(id);
		example.or(andIidEqualTo);
		List<Pics> selectByExample = picDao.selectByExample(example);

		return selectByExample;
	}

}
