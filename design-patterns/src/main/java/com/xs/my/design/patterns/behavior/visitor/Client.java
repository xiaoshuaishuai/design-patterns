package com.xs.my.design.patterns.behavior.visitor;

import java.util.List;

public class Client {
	public static void main(String[] args) {
		List<Element> list = Struture.getList();
        for(Element e: list){
            e.accept(new ConcreteVisitor());
        }
	}
}
