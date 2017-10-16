package com.xs.my.design.patterns.behavior.iterator;

/***
 * 抽象容器
 */
public interface Collection {

	public Iterator iterator();

	public void add(Object obj);

	public void remove(Object obj);

}
