package com.xs.my.design.patterns.behavior.visitor;
/**
 * 元素类
 */ 
public abstract class Element {
	  public abstract void accept(Visitor visitor);
      public abstract void doSomething();
}
