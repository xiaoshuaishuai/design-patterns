package com.xs.my.design.patterns.behavior.broker;

public class ColleagueA extends AbstractColleague {

	@Override
	public void setNumber(int number, AbstractMediator mediator) {
        this.number = number;
		mediator.AaffectB();
	}

}
