package com.xs.my.design.patterns.createtype.factory.simple;

/**
 * 工厂类
 * 
 * 宝马车的构建工厂
 * 
 * 
 */
public class BMWFactory {

	public BMW createBMW(int type) {
		switch (type) {
		case 3:
			return new BMW3X();
		case 5:
			return new BMW5X();
		default:
			break;
		}
		return null;
	}
}
