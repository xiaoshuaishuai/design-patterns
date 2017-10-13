package com.xs.my.design.patterns.struceturetype.flyweight;

/**
 * UnSharedConcreteFlyWeight 非共享享元实现类
 */
public class UnSharedConcreteFlyWeight implements FlyWeight {
	private String name;

	public UnSharedConcreteFlyWeight(String name) {
		this.name = name;
	}

	public void action(String name) {
		System.out.println("UnSharedConcreteFlyWeight.action()=," + this.name);
	}

}
