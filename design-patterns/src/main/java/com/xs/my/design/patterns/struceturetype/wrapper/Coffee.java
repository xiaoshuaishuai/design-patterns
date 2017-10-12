package com.xs.my.design.patterns.struceturetype.wrapper;

/**
 * l 抽象构件(Component)角色：给出一个抽象接口，以规范准备接收附加责任的对象。
 * 
 * 咖啡-改变原始咖啡
 * 可以加糖
 * 加牛奶
 * 相应的价格也会变
 *  
 *  等等
 */
public interface Coffee {

	public String name();

	public double price();

}
