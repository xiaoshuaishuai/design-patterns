package com.xs.my.design.patterns.struceturetype.flyweight;

import java.util.concurrent.ConcurrentHashMap;

/**
 * FlyWeightFactory 享元工厂类，控制实例的创建和共享
 */
public class FlyWeightFactory {
	/*
	 * 控制实例容器
	 */
	private static ConcurrentHashMap<String, FlyWeight> allFlyWeight = new ConcurrentHashMap<String, FlyWeight>();

	public static FlyWeight getFlyWeight(String name) {// name标识实例
		if (allFlyWeight.get(name) == null) {
			synchronized (allFlyWeight) {
				if (allFlyWeight.get(name) == null) {// double check 双重校验
					FlyWeight flyWeight = new ConcreteFlyWeight(name);
					System.out.println("创建" + name + "实例");
					allFlyWeight.put(name, flyWeight);
					return allFlyWeight.get(name);
				}
			}
		}
		System.out.println("工厂获取" + name + "实例");
		return allFlyWeight.get(name);
	}
}
