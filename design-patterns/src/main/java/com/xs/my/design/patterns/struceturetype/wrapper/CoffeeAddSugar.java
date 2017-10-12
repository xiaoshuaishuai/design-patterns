package com.xs.my.design.patterns.struceturetype.wrapper;

/**
 * 具体装饰类
 *     l 具体装饰角色(ConcreteDecorator)：负责给构件对象“贴上”附加的责任
 * 咖啡里加糖
 */
public class CoffeeAddSugar extends CoffeeWrapper {

	public CoffeeAddSugar(Coffee coffee) {
		super(coffee);
	}

	public String name() {
		System.out.println(super.name() + ",加糖");
		return super.name() + ",加糖";
	}

	public double price() {// 价格加8.8块
		System.out.println(super.price() + 8.8);
		return super.price() + 8.8;
	}
}
