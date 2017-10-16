package com.xs.my.design.patterns.behavior.observer;
/**
 * 具体观察者
 */
public class ObServer implements IObServer {
	public void update(String message) {
		System.out.println("观察者被通知:"+message);
	}

}
