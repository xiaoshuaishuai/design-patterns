package com.xs.my.design.patterns.createtype.factory.abstrac;
/**
 * 抽象工厂
 * */
public interface BMWFactory {
	//制造发动机
	public Engine createEngine();
	//制造底盘
	public UnderPan createUnderPan();
}
