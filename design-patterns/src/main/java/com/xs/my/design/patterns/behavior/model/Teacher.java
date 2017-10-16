package com.xs.my.design.patterns.behavior.model;

/**
 * 具体类
 * 
 */
public class Teacher extends AbstractPerson {

	@Override
	protected void dressUp() {
		System.out.println("老师穿衣服");
	}

	@Override
	protected void eatBreakfast() {
		System.out.println("老师照顾孩子吃早餐");
	}

	@Override
	protected void school() {
		System.out.println("老师带着教科书去学校");

	}

}
