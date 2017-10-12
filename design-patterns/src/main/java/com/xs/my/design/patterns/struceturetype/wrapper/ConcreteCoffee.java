package com.xs.my.design.patterns.struceturetype.wrapper;

/**
 * 要被装饰的类
 */
public class ConcreteCoffee implements Coffee {

	public String name() {
		return "原味咖啡";
	}

	public double price() {
		return 5.0;// 初始价格都是5块
	}

}
