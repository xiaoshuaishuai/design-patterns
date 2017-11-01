package com.xs.my.design.patterns.behavior.visitor;

public class ConcreteElement1 extends Element {

	@Override
	public void accept(Visitor visitor) {
		visitor.visit(this);
	}

	@Override
	public void doSomething() {
		// TODO Auto-generated method stub
		System.out.println("这是元素1");
	}

}
