package com.xs.my.design.patterns.behavior.commond;
/**
 * ConcreteCommand
 * */
public class ConcreteCommand implements Commond {
	Receiver receiver;

	public ConcreteCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void execute() {
		receiver.action();
	}

}
