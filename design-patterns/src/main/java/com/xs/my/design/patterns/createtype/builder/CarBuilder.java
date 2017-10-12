package com.xs.my.design.patterns.createtype.builder;
/**
 * 汽车建造者
 */
public class CarBuilder implements Builder {

	public String createEngine() {
		return "汽车引擎";
	}

	public String createTire() {
		return "汽车轮胎";

	}

	public String createSeat() {
		return "汽车座椅";
	}

}
