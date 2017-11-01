package com.xs.my.design.patterns.behavior.state;

public class ConcreateStateA extends State {

	@Override
	public void handle(Context context) {
		System.out.println("当前状态A");
		context.setState(new ConcreateStateB());
	}


}
