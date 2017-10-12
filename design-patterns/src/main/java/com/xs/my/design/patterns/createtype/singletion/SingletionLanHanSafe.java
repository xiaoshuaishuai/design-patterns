package com.xs.my.design.patterns.createtype.singletion;
/**
 * 懒汉 -线程安全
 * 
 * 并发差，任何时候只能有一个线程调用getSingletion()
 * 
 * */
public class SingletionLanHanSafe {
	private static SingletionLanHanSafe singletionLanHan;

	private SingletionLanHanSafe() {
	}

	public synchronized static SingletionLanHanSafe getSingletion() {
		if (null == singletionLanHan) {
			singletionLanHan = new SingletionLanHanSafe();
		}
		return singletionLanHan;
	}
}
