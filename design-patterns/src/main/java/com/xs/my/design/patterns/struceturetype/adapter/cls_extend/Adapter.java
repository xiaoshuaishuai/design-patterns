package com.xs.my.design.patterns.struceturetype.adapter.cls;
/**
 * Adapter 适配器
 * 
 * 
 * 继承被适配者adaptee具有了超能力 extends Adaptee
 * 
 * 然后还需要符合我们的目标接口target的规范 implements Target
 * 
 */
public class Adapter extends Adaptee implements Target{

	public void request() {
		super.specialRequest();//既具有了适配功能，又符合了规范
	}

}
