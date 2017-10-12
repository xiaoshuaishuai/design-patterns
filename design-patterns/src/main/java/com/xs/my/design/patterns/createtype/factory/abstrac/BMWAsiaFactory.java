package com.xs.my.design.patterns.createtype.factory.abstrac;
/**
 * 具体工厂
 * 
 * 
 * 亚洲Asia工厂生产:
 * V8引擎
 * E1底盘
 * 
 */
public class BMWAsiaFactory implements BMWFactory {

	public Engine createEngine() {
		return new V8Engine();
	}

	public UnderPan createUnderPan() {
		return new  E1UnderPan();
	}

}
