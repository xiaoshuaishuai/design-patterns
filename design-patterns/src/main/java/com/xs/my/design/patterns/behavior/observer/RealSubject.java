package com.xs.my.design.patterns.behavior.observer;
/**
 * 
 * 被观察者真实对象
 * 
 * 调用观察者
 */
public class RealSubject extends Subject {

	@Override
	public void connect(String message) {
		System.out.println("连接....");
		update(message);//调用观察者
	}

	@Override
	public void disConnect(String message) {
		System.out.println("断开连接....");
		update(message);//调用观察者
	}

}
