package com.xs.my.design.patterns.behavior.observer;

import java.util.Vector;

/**
 * 目标对象
 * 
 * 组装观察者
 */
public abstract class Subject {

	public static final Vector<IObServer> vector = new Vector<IObServer>();


	public void addObServer(IObServer observer) {
		vector.add(observer);
	}

	public void removeObServer(IObServer observer) {
		vector.remove(observer);
	}

	public void update(String message) {
		for (IObServer obServer : vector) {
			obServer.update(message);
		}
	}

	public abstract void connect(String message);

	public abstract void disConnect(String message);


}
