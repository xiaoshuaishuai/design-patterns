package com.xs.my.design.patterns.behavior.state;

/**
 * 上下文
 */
public class Context {

	private State state;

	public Context(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public void request() {
		state.handle(this);
	}
}
