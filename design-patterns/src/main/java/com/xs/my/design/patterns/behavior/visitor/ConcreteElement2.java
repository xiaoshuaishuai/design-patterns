package com.xs.my.design.patterns.behavior.visitor;

public class ConcreteElement2 extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void doSomething() {
		System.out.println("这是元素2");
	}

}
