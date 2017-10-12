package com.xs.my.design.patterns.createtype.singletion;

/**
 * 恶汉-静态代码块
 * 延时加载
 */
public class SingletionEHanStaticBlock {
	private static final SingletionEHanStaticBlock singletionLanHan;

	static {
		singletionLanHan = new SingletionEHanStaticBlock();
	}

	private SingletionEHanStaticBlock() {
	}

	public static SingletionEHanStaticBlock getSingletion() {
		return singletionLanHan;
	}
}
