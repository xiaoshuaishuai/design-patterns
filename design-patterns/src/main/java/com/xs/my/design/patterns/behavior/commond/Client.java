package com.xs.my.design.patterns.behavior.commond;
/**
 * 客户端
 * */
public class Client {
	public static void main(String[] args) {

		Receiver receiver = new Receiver();
		Commond commond = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker(commond);
		invoker.action();
	}

}
