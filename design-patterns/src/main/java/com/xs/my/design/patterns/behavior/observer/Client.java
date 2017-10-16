package com.xs.my.design.patterns.behavior.observer;

public class Client {

	public static void main(String[] args) {

		RealSubject subject = new RealSubject();
		subject.addObServer(new ObServer());// 创建观察者
		subject.connect("connect");
		subject.disConnect("disConnect");
	}
}
