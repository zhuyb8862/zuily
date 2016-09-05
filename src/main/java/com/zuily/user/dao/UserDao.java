package com.zuily.user.dao;

import com.zuily.item.bean.User;

public interface UserDao {
	public void regit(User user);
	public  User login(String name);

}
