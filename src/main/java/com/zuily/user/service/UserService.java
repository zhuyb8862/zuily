package com.zuily.user.service;

import com.zuily.item.bean.User;

public interface UserService {
	public boolean reg(User user);
	public User login(User user);
	public User find(User user);
	

}
