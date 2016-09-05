package com.zuily.banner.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zuily.banner.bean.Banner;
import com.zuily.banner.bean.BannerExample;
import com.zuily.banner.bean.BannerExample.Criteria;
import com.zuily.banner.dao.BannerMapper;
import com.zuily.banner.service.BannerService;

@Transactional
@Service
public class BannerServiceImpl implements BannerService {
	@Autowired
	private BannerMapper bannerDao;

	@Override
	public void insert(Banner banner) {
		bannerDao.insert(banner);

	}

	@Override
	public List<Banner> getAll() {
		
		BannerExample example = new BannerExample();
		Criteria andBidIsNotNull = example.createCriteria().andBidIsNotNull();
		example.or(andBidIsNotNull);
		List<Banner> selectByExample = bannerDao.selectByExample(example);
		return selectByExample;
	}

	@Override
	public void upline(int id) {
		Banner banner = bannerDao.selectByPrimaryKey(id);
		banner.setState((byte) 1);
		bannerDao.updateByPrimaryKey(banner);
	}

	@Override
	public void offline(int id) {
		Banner banner = bannerDao.selectByPrimaryKey(id);	
		banner.setState((byte) 2);
		bannerDao.updateByPrimaryKey(banner);
	}

}
