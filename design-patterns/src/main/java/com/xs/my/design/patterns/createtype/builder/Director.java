package com.xs.my.design.patterns.createtype.builder;

/**
 * 指导者、导演
 * 
 * 造车导演
 */
public class Director {
	Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	/**
	 * 建造好零部件之后，组装车
	 */
	public Vehicle construct() {
		Vehicle vehicle = new Vehicle();
		vehicle.setEngine(builder.createEngine());
		vehicle.setTire(builder.createTire());
		vehicle.setSeat(builder.createSeat());
		return vehicle;
	}
}
