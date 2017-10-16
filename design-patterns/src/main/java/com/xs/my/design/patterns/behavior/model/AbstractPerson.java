package com.xs.my.design.patterns.behavior.model;

/**
 * 抽象类
 * 
 */
public abstract class AbstractPerson {
	//抽象类定义整个流程骨架
	public final void go() {
		dressUp();
		eatBreakfast();
		school();
	}

	// 定义不同子类所要实现的方法
	protected abstract void dressUp();

	protected abstract void eatBreakfast();

	protected abstract void school();
}
