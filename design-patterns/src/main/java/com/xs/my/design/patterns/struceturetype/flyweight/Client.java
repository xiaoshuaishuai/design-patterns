package com.xs.my.design.patterns.struceturetype.flyweight;

public class Client {

	public static void main(String[] args) {
		
		FlyWeight fw_a = FlyWeightFactory.getFlyWeight("A");
		FlyWeight fw_b = FlyWeightFactory.getFlyWeight("B");
		FlyWeight fw_c = FlyWeightFactory.getFlyWeight("C");
		System.out.println("分割------下面是从工厂获取的，而不是new的");
		
		FlyWeight fw_a_ = FlyWeightFactory.getFlyWeight("A");
		FlyWeight fw_b_ = FlyWeightFactory.getFlyWeight("B");
		FlyWeight fw_c_ = FlyWeightFactory.getFlyWeight("C");
		
	}
}
