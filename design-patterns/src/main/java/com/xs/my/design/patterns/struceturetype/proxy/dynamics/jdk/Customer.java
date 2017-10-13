package com.xs.my.design.patterns.struceturetype.proxy.dynamics.jdk;

import java.lang.reflect.Proxy;

public class Customer {

	public static void main(String[] args) {
		ZhangSan zs = new ZhangSan();
		WebOperate proxy = (WebOperate) Proxy.newProxyInstance(zs.getClass().getClassLoader(), zs.getClass().getInterfaces(),
				new MyInvocationHandler(zs));
		proxy.click();
		proxy.copy();
	}
}
