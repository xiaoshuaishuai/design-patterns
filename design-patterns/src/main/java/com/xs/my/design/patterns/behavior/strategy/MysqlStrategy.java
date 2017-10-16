package com.xs.my.design.patterns.behavior.strategy;
/**
 * 策略具体类
 */
public class MysqlStrategy implements IStrategy{

	public void query() {
		System.out.println("从mysql查询数据....");
	}

}
