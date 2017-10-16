package com.xs.my.design.patterns.behavior.strategy;
/**
 * 环境类
 */
public class Context {

	private IStrategy strategy;

	public Context(IStrategy strategy) {
		this.strategy = strategy;
	}
	

	public void query() {
		strategy.query();//调用具体类
	}
}
