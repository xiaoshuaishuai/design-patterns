package com.xs.my.design.patterns.struceturetype.proxy.dynamics.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MyInvocationHandler implements InvocationHandler {
	private Object realSubject;// 等待代理的 真实对象.

	public MyInvocationHandler(Object realSubject) {
		this.realSubject = realSubject;
	}

	private void before() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + "开始====");
	}

	private void after() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + "结束====");
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		before();
		Object result = method.invoke(realSubject, args);// 执行真实对象方法
		after();
		return result;
	}
}
