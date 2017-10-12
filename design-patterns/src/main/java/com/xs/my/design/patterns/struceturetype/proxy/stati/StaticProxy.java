package com.xs.my.design.patterns.struceturetype.proxy.stati;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 代理对象
 */
public class StaticProxy implements WebOperate {
	private WebOperate webOperate;

	public StaticProxy(WebOperate webOperate) {
		this.webOperate = webOperate;
	}

	public void click() {
		before();
		webOperate.click();
		after();
	}

	public void copy() {
		before();
		webOperate.copy();
		after();
	}

	private void before() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + "开始====");
	}

	private void after() {
		System.out.println(new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()) + "结束====");
	}
}
