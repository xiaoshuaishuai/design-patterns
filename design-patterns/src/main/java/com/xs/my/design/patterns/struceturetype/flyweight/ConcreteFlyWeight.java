package com.xs.my.design.patterns.struceturetype.flyweight;
/**
 * ConcreteFlyWeight 具体享元类，该类实例将实现共享
 */
public class ConcreteFlyWeight implements FlyWeight {
	private String name;
	public ConcreteFlyWeight(String name) {
		this.name = name;
	}


	public void action(String name) {
		System.out.println("ConcreteFlyWeight.action()=,"+this.name);
	}

}
