package com.xs.my.design.patterns.struceturetype.wrapper;

/**
 * 具体装饰类
 *     l 具体装饰角色(ConcreteDecorator)：负责给构件对象“贴上”附加的责任
 * 咖啡里加牛奶
 */
public class CoffeeAddMilk extends CoffeeWrapper {

	public CoffeeAddMilk(Coffee coffee) {
		super(coffee);
	}

	public String name() {
		System.out.println(super.name() + ",牛奶");
		return super.name() + ",牛奶";
	}

	public double price() {// 价格加五块
		System.out.println(super.price() + 5.0);
		return super.price() + 5.0;
	}
}
