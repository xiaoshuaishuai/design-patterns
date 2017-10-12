package com.xs.my.design.patterns.struceturetype.wrapper;
/**
 * 包装类
 */
public class CoffeeWrapper implements Coffee {
	private Coffee coffee;

	public CoffeeWrapper(Coffee coffee) {
		this.coffee = coffee;
	}

	public String name() {
		return coffee.name();
	}

	public double price() {
		return coffee.price();
	}

}
