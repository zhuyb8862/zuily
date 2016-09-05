package com.zuily.item.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zuily.item.bean.Feeexclude;
import com.zuily.item.bean.FeeexcludeExample;
import com.zuily.item.bean.Feeinclude;
import com.zuily.item.bean.FeeincludeExample;
import com.zuily.item.bean.Items;
import com.zuily.item.bean.Jplan;
import com.zuily.item.bean.JplanExample;
import com.zuily.item.bean.JplanExample.Criteria;
import com.zuily.item.bean.Jtime;
import com.zuily.item.bean.JtimeExample;
import com.zuily.item.bean.Notice;
import com.zuily.item.bean.NoticeExample;
import com.zuily.item.bean.Pics;
import com.zuily.item.bean.PicsExample;
import com.zuily.item.bean.ItemDetal;
import com.zuily.item.dao.FeeexcludeMapper;
import com.zuily.item.dao.FeeincludeMapper;
import com.zuily.item.dao.ItemsMapper;
import com.zuily.item.dao.JplanMapper;
import com.zuily.item.dao.JtimeMapper;
import com.zuily.item.dao.NoticeMapper;
import com.zuily.item.dao.PicsMapper;
import com.zuily.item.service.RitemAllService;

@Service
public class RitemAllServiceImpl implements RitemAllService {

	@Autowired
	private ItemsMapper itemsDao;
	@Autowired
	private FeeexcludeMapper feeexDao;
	@Autowired
	private FeeincludeMapper feeinDao;
	@Autowired
	private JplanMapper jplanDao;
	@Autowired
	private JtimeMapper jtimeDao;
	@Autowired
	private NoticeMapper noticeDao;
	@Autowired
	private PicsMapper picsDao;

	@Override
	public ItemDetal getItemDetal(int id) {
		ItemDetal itemDetal = new ItemDetal();
		Items item = itemsDao.selectByPrimaryKey(id);
		itemDetal.setItem(item);
		//
		JplanExample example = new JplanExample();
		Criteria createCriteria = example.createCriteria().andIidEqualTo(id);
		example.or(createCriteria);
		List<Jplan> JplanList = jplanDao.selectByExample(example);
		itemDetal.setPlans(JplanList);
		
		FeeexcludeExample FexExample = new FeeexcludeExample();
		com.zuily.item.bean.FeeexcludeExample.Criteria fexCriteria = FexExample.createCriteria().andIidEqualTo(id);
		example.or(createCriteria);
		List<Feeexclude> FeeexcludeList = feeexDao.selectByExample(FexExample);
		itemDetal.setFeeexs(FeeexcludeList);
		
		FeeincludeExample feeincludeExample = new FeeincludeExample();
		com.zuily.item.bean.FeeincludeExample.Criteria andIidEqualTo = feeincludeExample.createCriteria().andIidEqualTo(id);
		feeincludeExample.or(andIidEqualTo);
		List<Feeinclude> feeincludeList = feeinDao.selectByExample(feeincludeExample);
		itemDetal.setFeeins(feeincludeList);
		
		JtimeExample jtimeExample = new JtimeExample();
		com.zuily.item.bean.JtimeExample.Criteria andIidEqualTo2 = jtimeExample.createCriteria().andIidEqualTo(id);
		jtimeExample.or(andIidEqualTo2);
		List<Jtime> selectByExample = jtimeDao.selectByExample(jtimeExample);
		itemDetal.setTimes(selectByExample);
		
		NoticeExample noticeExample = new NoticeExample();
		com.zuily.item.bean.NoticeExample.Criteria andIidEqualTo3 = noticeExample.createCriteria().andIidEqualTo(id);
		noticeExample.or(andIidEqualTo3);
		List<Notice> noticeList = noticeDao.selectByExample(noticeExample);
		itemDetal.setNotices(noticeList);
	
		PicsExample picsExample = new PicsExample();
		com.zuily.item.bean.PicsExample.Criteria picCri = picsExample.createCriteria().andIidEqualTo(id);
		picsExample.or(picCri);
		List<Pics> picList = picsDao.selectByExample(picsExample);
		itemDetal.setPics(picList);
		return itemDetal;
		
	}

}
