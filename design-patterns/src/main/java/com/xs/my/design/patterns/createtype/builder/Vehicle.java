package com.xs.my.design.patterns.createtype.builder;
/**
 * product产品
 * 这里为车
 */
public class Vehicle {
	
	private String engine;
	private String tire;
	private String seat;
	
	
	public String getEngine() {
		return engine;
	}
	public void setEngine(String engine) {
		this.engine = engine;
	}
	public String getTire() {
		return tire;
	}
	public void setTire(String tire) {
		this.tire = tire;
	}
	public String getSeat() {
		return seat;
	}
	public void setSeat(String seat) {
		this.seat = seat;
	}
	@Override
	public String toString() {
		return "Vehicle [engine=" + engine + ", tire=" + tire + ", seat=" + seat + "]";
	}

	
}
