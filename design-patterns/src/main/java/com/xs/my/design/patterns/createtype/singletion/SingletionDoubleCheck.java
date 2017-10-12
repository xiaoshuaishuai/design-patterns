package com.xs.my.design.patterns.createtype.singletion;
/**
 * 双重校验锁
 * 
 * volatile and synchronized
 * 
 * 
 * */
public class SingletionDoubleCheck {
	//volatile 在Java中一个特性是保证可见性，另一个是禁止指令重排序优化。这里主要用到了后者，在volatile变量的赋值操作后面会有一个内存屏障，取操作不会被重排序到内存屏障之前。
	private static volatile  SingletionDoubleCheck singletionLanHan;

	private SingletionDoubleCheck() {
	}

	public static SingletionDoubleCheck getSingletion() {
		if (null == singletionLanHan) {
			synchronized(SingletionDoubleCheck.class){ //这样只会在第一次创建的时候导致阻塞,创建之后并不会阻塞
				if (null == singletionLanHan) {
					singletionLanHan = new SingletionDoubleCheck();
				}
			}
		}
		return singletionLanHan;
	}
}
