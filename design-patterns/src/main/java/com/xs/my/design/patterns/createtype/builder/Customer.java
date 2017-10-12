package com.xs.my.design.patterns.createtype.builder;

public class Customer {

	public static void main(String[] args) {
		
		//先叫导演过来，给他个建造师造车
		Director director = new Director(new CarBuilder());
		System.out.println(director.construct().toString());
		//造辆火车
		Director director2 = new Director(new TrainBuilder());
		System.out.println(director2.construct().toString());
	}
}
