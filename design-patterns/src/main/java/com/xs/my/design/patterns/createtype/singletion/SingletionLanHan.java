package com.xs.my.design.patterns.createtype.singletion;
/**
 * 懒汉 -线程不安全
 * */
public class SingletionLanHan {
	private static SingletionLanHan singletionLanHan;

	private SingletionLanHan() {
	}

	public static SingletionLanHan getSingletion() {
		if (null == singletionLanHan) {
			singletionLanHan = new SingletionLanHan();
		}
		return singletionLanHan;
	}
}
