package com.zuily.item.service;

import java.util.List;

import com.zuily.item.bean.Notice;

public interface NoticeService {
	public void insertNotice(Notice notice)throws Exception;

	public List<Notice> selectById(int id);

}
