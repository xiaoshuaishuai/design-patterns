package com.xs.my.design.patterns.createtype.factory.abstrac;

public class Customer {

	public static void main(String[] args) {
		BMWFactory asiaFactory = new BMWAsiaFactory();
		System.out.println("亚洲工厂生产：");
		asiaFactory.createEngine();
		asiaFactory.createUnderPan();
		
		BMWFactory europeFactory = new BMWEuropeFactory();
		System.out.println("欧洲工厂生产：");
		europeFactory.createEngine();
		europeFactory.createUnderPan();
	}
}
