package com.xs.my.design.patterns.createtype.builder;
/**
 * 火车建造者
 */
public class TrainBuilder implements Builder {

	public String createEngine() {
		return "火车引擎";
	}

	public String createTire() {
		return "火车轮胎";

	}

	public String createSeat() {
		return "火车座椅";
	}

}
