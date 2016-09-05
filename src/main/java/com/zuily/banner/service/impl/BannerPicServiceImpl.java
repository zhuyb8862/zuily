package com.zuily.banner.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zuily.banner.bean.Banner;
import com.zuily.banner.bean.BannerExample;
import com.zuily.banner.bean.BannerExample.Criteria;
import com.zuily.banner.bean.Bannerpic;
import com.zuily.banner.bean.BannerpicExample;
import com.zuily.banner.dao.BannerpicMapper;
import com.zuily.banner.service.BannerPicService;

@Transactional
@Service
public class BannerPicServiceImpl implements BannerPicService {
	@Autowired
	private BannerpicMapper Bannerpicdao;

	@Override
	public void insert(Bannerpic bannerpic) {
		Bannerpicdao.insert(bannerpic);
	}

	@Override
	public void insert(List<Bannerpic> bannerpiclist) {
		for (Bannerpic bannerpic : bannerpiclist) {
			Bannerpicdao.insert(bannerpic);
		}

	}

	@Override
	public Bannerpic findByBid(Integer bid) {
		BannerpicExample example = new BannerpicExample();

		com.zuily.banner.bean.BannerpicExample.Criteria andBidEqualTo = example
				.createCriteria().andBidEqualTo(bid);
		example.or(andBidEqualTo);
		List<Bannerpic> selectByExample = Bannerpicdao.selectByExample(example);
		if (selectByExample.size() == 0)
			return null;
		Bannerpic bannerpic = selectByExample.get(0);
		return bannerpic;
	}

}
