package com.xs.my.design.patterns.createtype.prototype;
/**
 * 原型模式
 */
public class Prototype implements Cloneable {
	@Override
	public Prototype clone(){
		Prototype prototype =null;
		try {
			prototype = (Prototype) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return prototype;
	}
}

