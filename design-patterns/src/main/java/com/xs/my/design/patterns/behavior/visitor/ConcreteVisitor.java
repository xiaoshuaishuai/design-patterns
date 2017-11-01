package com.xs.my.design.patterns.behavior.visitor;

/**
 * 具体访问者
 */
public class ConcreteVisitor implements Visitor {

	public void visit(ConcreteElement1 el1) {
		el1.doSomething();
	}

	public void visit(ConcreteElement2 el2) {
		el2.doSomething();
	}

}
