package com.xs.my.design.patterns.struceturetype.proxy.dynamics.jdk;


/**
 * 
 * 真实角色 
 * 
 * realsubject
 * 
*/
public class ZhangSan implements WebOperate{

	public void click() {
		System.out.println("张三点击...");
	}

	public void copy() {
		System.out.println("张三复制...");
	}
}
