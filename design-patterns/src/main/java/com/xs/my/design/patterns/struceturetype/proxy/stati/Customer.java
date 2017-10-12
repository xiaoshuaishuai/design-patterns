package com.xs.my.design.patterns.struceturetype.proxy.stati;

public class Customer {

	public static void main(String[] args) {
		WebOperate proxy = new StaticProxy(new ZhangSan());
		proxy.click();
		proxy.copy();
	}
}
