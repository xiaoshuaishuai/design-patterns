package com.xs.my.design.patterns.behavior.strategy;

public class Client {

	public static void main(String[] args) {
		System.out.println("第一种策略");
		Context context1 = new Context(new RedisStrategy());//缺点就是客户端需要知道具体使用的策略
		context1.query();
		System.out.println("第二种策略");
		Context context2 = new Context(new MysqlStrategy());
		context2.query();
		System.out.println("第三种策略");
		Context context3 = new Context(new OracleStrategy());
		context3.query();
	}
}
