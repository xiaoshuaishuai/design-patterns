package com.xs.my.design.patterns.struceturetype.adapter.obj;

/**
 * Adapter 适配器
 * 
 * 
 * 继承被适配者adaptee具有了超能力 【这里和类适配extend不同】，这里直接注入adaptee
 * 
 * 然后还需要符合我们的目标接口target的规范 implements Target
 * 
 */
public class Adapter implements Target {
	private Adaptee adaptee;

	public Adapter(Adaptee adaptee) {
		this.adaptee = adaptee;
	}

	public void request() {
		adaptee.specialRequest();// 既具有了适配功能，又符合了规范
	}

}
