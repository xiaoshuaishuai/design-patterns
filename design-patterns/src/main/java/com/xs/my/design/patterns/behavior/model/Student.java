package com.xs.my.design.patterns.behavior.model;

/**
 * 具体类
 * 
 */
public class Student extends AbstractPerson {

	@Override
	protected void dressUp() {
		System.out.println("学生穿衣服");
	}

	@Override
	protected void eatBreakfast() {
		System.out.println("学生吃早餐");
	}

	@Override
	protected void school() {
		System.out.println("学生背着书包去上学");

	}

}
