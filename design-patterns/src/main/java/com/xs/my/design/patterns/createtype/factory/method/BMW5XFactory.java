package com.xs.my.design.patterns.createtype.factory.method;
/**
 * 宝马5系工厂
 */
public class BMW5XFactory implements BMWFactory{

	public BMW createBMW() {
		return new BMW5X();
	}
}
