package com.xs.my.design.patterns.createtype.factory.method;
/**
 * 宝马3系工厂
 */
public class BMW3XFactory implements BMWFactory{

	public BMW createBMW() {
		return new BMW3X();
	}
}
