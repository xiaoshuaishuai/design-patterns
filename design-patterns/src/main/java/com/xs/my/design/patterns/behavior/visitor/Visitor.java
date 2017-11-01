package com.xs.my.design.patterns.behavior.visitor;
/**
 * 
 * 抽象访问者类  visitor
 * 
 * */
public interface Visitor {

    public void visit(ConcreteElement1 el1);
    public void visit(ConcreteElement2 el2);
}
