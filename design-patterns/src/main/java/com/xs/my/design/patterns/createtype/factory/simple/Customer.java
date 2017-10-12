package com.xs.my.design.patterns.createtype.factory.simple;
/**
 * 消费者用户
 * 
 * */
public class Customer {

	public static void main(String[] args) {
		BMWFactory factory = new BMWFactory();
		factory.createBMW(3);
		factory.createBMW(5);
	}
}
