package com.zuily.intercepter;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class TestInterceptor2  implements MethodInterceptor{

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2,
			MethodProxy arg3) throws Throwable {
		// TODO Auto-generated method stub
		return null;
	}

}
