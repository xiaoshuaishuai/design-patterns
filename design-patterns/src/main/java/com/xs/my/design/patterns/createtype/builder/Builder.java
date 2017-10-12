package com.xs.my.design.patterns.createtype.builder;

/**
 * 创建一个产品部件的抽象
 */
public interface Builder {

	public String createEngine();

	public String createTire();

	public String createSeat();

}
