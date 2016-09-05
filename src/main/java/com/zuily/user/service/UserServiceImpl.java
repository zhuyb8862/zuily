package com.zuily.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zuily.item.bean.User;
import com.zuily.user.dao.UserDao;
@Service
@Transactional
public class UserServiceImpl implements UserService {
@Autowired
private UserDao userDao;
	public boolean reg(User user) {
		return false;
	}


	public User login(User user) {
		
		return userDao.login(user.getName());
	}

	
	public User find(User user) {
		System.out.println(user.getName());
		User us= userDao.login(user.getName());
		
	
		return us;
	}

}
