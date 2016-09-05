package com.zuily.user.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.zuily.item.bean.User;
import com.zuily.user.service.UserService;
import com.zuily.utils.MD5;

@Controller

public class UserController {
	@Autowired 
	private UserService userservice;
	/**
	 * 注册
	 * @param user
	 * @return
	 */
	@RequestMapping("/reg.do")
	public ModelAndView reg(User user) {
		user.setEnable("0");
		ModelAndView andView = new ModelAndView();
		if(userservice.reg(user)){
			andView.setViewName("login");
			andView.addObject("message", "注册成功,请等到管理员审核");
			return andView;
		}
		
		andView.setViewName("login");
		andView.addObject("message", "注册失败,请过一会再试");
		return andView;
	}
	/**
	 * 登陆
	 * @param user
	 * @return
	 */
	@RequestMapping("/manager/login.do")
	public ModelAndView login(User userform,HttpServletRequest request) {
		ModelAndView andView = new ModelAndView();
		User us = userservice.find(userform);
		if(us==null){
			andView.setViewName("login");
			andView.addObject("message", "用户不存在");
			return andView;
		}
		if(us.getPassword().equals(MD5.getMD5(userform.getPassword()))){
			request.getSession().setAttribute("user", us);
			andView.setViewName("index");
			return andView;
		}
		andView.setViewName("login");
		andView.addObject("message", "密码错误");
		return andView;
	}
	@RequestMapping("/logout.do")
	public String logout() {

	
		return "login";
	}
	@RequestMapping("/find.do")
	public ModelAndView find(HttpServletRequest request) {
		request.getSession().invalidate();
		ModelAndView andView = new ModelAndView();
		return andView;
	}

	
	

}
