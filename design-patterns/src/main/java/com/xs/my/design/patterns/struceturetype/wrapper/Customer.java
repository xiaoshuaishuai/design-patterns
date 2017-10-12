package com.xs.my.design.patterns.struceturetype.wrapper;

public class Customer {

	public static void main(String[] args) {
		Coffee yw = new ConcreteCoffee();

		Coffee milk = new CoffeeAddMilk(yw);// 加牛奶
		milk.name();
		milk.price();

		System.out.println("==============");
		Coffee sugar = new CoffeeAddSugar(yw);// 加糖
		sugar.name();
		sugar.price();
	}
}
