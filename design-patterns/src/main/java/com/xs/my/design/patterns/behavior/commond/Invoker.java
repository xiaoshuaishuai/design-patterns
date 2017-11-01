package com.xs.my.design.patterns.behavior.commond;

/**
 * 请求者角色
 */
public class Invoker {
	Commond commond;

	public Invoker(Commond commond) {
		this.commond = commond;
	}

	public void action() {
		commond.execute();
	}
}
