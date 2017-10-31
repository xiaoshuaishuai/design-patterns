package com.xs.my.design.patterns.struceturetype.adapter.obj_join;

/**
 * adaptee 被适配者
 * 
 * 具有超能力,但是他不符合我们想要的接口形式,所有后面需要adapter适配器让消费者具有超能力
 */
public class Adaptee {

	public void specialRequest() {
		System.out.println("既有普通功能,又有超能力...");
	}

}
