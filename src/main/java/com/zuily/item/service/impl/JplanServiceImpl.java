package com.zuily.item.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuily.item.bean.Jplan;
import com.zuily.item.bean.JplanExample;
import com.zuily.item.dao.JplanMapper;
import com.zuily.item.service.JplanService;

@Service
public class JplanServiceImpl implements JplanService {
	@Autowired
	private JplanMapper JplanDao;

	@Override
	public void insert(Jplan jplan) throws Exception {
		JplanDao.insert(jplan);

	}

	@Override
	public List<Jplan> selectByIid(int id) {
		JplanExample example = new JplanExample();
		example.or(example.createCriteria().andIidEqualTo(id));

		List<Jplan> selectByExample = JplanDao.selectByExample(example);
		return selectByExample;
	}

}
