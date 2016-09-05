package com.zuily.item.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zuily.item.bean.Notice;
import com.zuily.item.bean.NoticeExample;
import com.zuily.item.dao.NoticeMapper;
import com.zuily.item.service.NoticeService;

@Transactional
@Service
public class NoticeServiceImpl implements NoticeService {
	@Autowired
	private NoticeMapper noticeDao;

	@Override
	public void insertNotice(Notice notice) throws Exception {
		noticeDao.insert(notice);

	}

	@Override
	public List<Notice> selectById(int id) {
		NoticeExample example = new NoticeExample();
		example.or(example.createCriteria().andIidEqualTo(id));
		List<Notice> selectByExample = noticeDao.selectByExample(example);
		return selectByExample;
	}

}
