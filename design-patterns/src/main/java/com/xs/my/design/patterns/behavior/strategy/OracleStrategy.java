package com.xs.my.design.patterns.behavior.strategy;
/**
 * 策略具体类
 */
public class OracleStrategy implements IStrategy{

	public void query() {
		System.out.println("从oracle查询数据....");
	}

}
