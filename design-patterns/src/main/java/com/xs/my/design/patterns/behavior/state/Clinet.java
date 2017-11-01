package com.xs.my.design.patterns.behavior.state;

public class Clinet {

	public static void main(String[] args) {
		Context context = new Context(new ConcreateStateA());
		context.request();
		context.request();
		context.request();
		context.request();
		context.request();
		// console:
		// 当前状态A
		// 当前状态B
		// 当前状态A
		// 当前状态B
		// 当前状态A

	}
}
