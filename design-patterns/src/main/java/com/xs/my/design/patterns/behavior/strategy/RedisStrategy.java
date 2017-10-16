package com.xs.my.design.patterns.behavior.strategy;
/**
 * 策略具体类
 */
public class RedisStrategy implements IStrategy{

	public void query() {
		System.out.println("从redis查询数据....");
	}

}
