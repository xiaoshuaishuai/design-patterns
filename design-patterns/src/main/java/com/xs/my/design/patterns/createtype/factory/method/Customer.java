package com.xs.my.design.patterns.createtype.factory.method;
/**
 * 消费者用户
 * 
 * */
public class Customer {

	public static void main(String[] args) {
		BMWFactory bMW3XFactory = new BMW3XFactory();
		BMWFactory bMW5XFactory = new BMW5XFactory();
		
		bMW3XFactory.createBMW();
		bMW5XFactory.createBMW();
	}
}
