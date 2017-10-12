package com.xs.my.design.patterns.createtype.factory.abstrac;
/**
 * 具体工厂
 * 
 * 
 * 欧洲Europe工厂生产:
 * V12引擎
 * E2底盘
 * 
 */
public class BMWEuropeFactory implements BMWFactory {

	public Engine createEngine() {
		return new V12Engine();
	}

	public UnderPan createUnderPan() {
		return new  E2UnderPan();
	}

}
