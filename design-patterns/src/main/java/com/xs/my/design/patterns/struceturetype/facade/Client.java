package com.xs.my.design.patterns.struceturetype.facade;

public class Client {

	public static void main(String[] args) {
		ComputerFacade facade = new ComputerFacade();
		facade.start();
		facade.stop();
	}
}
