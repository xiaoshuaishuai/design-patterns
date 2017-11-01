package com.xs.my.design.patterns.behavior.memo;

/**
 * 备忘录
 */
public class Memo {
	private String state = "";

	public Memo(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
