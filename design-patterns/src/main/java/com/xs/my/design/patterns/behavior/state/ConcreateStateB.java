package com.xs.my.design.patterns.behavior.state;

public class ConcreateStateB extends State {

	@Override
	public void handle(Context context) {
		System.out.println("当前状态B");
		context.setState(new ConcreateStateA());

	}

}
