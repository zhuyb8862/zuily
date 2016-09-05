package com.zuily.item.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zuily.item.bean.Jtime;
import com.zuily.item.bean.JtimeExample;
import com.zuily.item.dao.JtimeMapper;
import com.zuily.item.service.TimeService;
@Transactional
@Service
public class TimeServiceImpl implements TimeService {
@Autowired
private JtimeMapper timeDao;
	@Override
	public void insert(Jtime jtime) throws Exception {
		timeDao.insert(jtime);
		
	}
	@Override
	public List<Jtime> selectByIid(int id) {
		
		
		JtimeExample example = new JtimeExample();
		example.or(example.createCriteria().andIidEqualTo(id));
		
		
		List<Jtime> times = timeDao.selectByExample(example);
		
		return times;
	}

}
