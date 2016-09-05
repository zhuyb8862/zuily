package com.zuily.item.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zuily.item.bean.Feeexclude;
import com.zuily.item.bean.FeeexcludeExample;
import com.zuily.item.bean.Feeinclude;
import com.zuily.item.bean.FeeincludeExample;
import com.zuily.item.dao.FeeexcludeMapper;
import com.zuily.item.dao.FeeincludeMapper;
import com.zuily.item.service.FeeService;

@Transactional
@Service
public class FeeServiceImpl implements com.zuily.item.service.FeeService {
	@Autowired
	private FeeexcludeMapper feeExcludDao;
	@Autowired
	private FeeincludeMapper feeIncludDao;

	@Override
	public void insertIncludeFee(Feeinclude feeInclud) throws Exception {
		feeIncludDao.insert(feeInclud);

	}

	@Override
	public void insertExcludeFee(Feeexclude feeExclud) throws Exception {
		feeExcludDao.insert(feeExclud);
	}

	@Override
	public List<Feeexclude> selectByIid(int id) {

		FeeexcludeExample example = new FeeexcludeExample();
		example.or(example.createCriteria().andIidEqualTo(id));

		List<Feeexclude> selectByExample = feeExcludDao
				.selectByExample(example);

		return selectByExample;
	}

	@Override
	public List<Feeinclude> selectFeeinByIid(int id) {
		FeeincludeExample example = new FeeincludeExample();
		example.or(example.createCriteria().andIidEqualTo(id));
		List<Feeinclude> selectByExample = feeIncludDao.selectByExample(example);
		return selectByExample;
	}

}
