package com.xs.my.design.patterns.behavior.iterator;

import java.util.ArrayList;
import java.util.List;

public class ConcreateCollection implements Collection {
	private List list = new ArrayList();

	public Iterator iterator() {
		return new ConcreateIterator(list);// 创建迭代器
	}

	public void remove(Object obj) {
		// TODO Auto-generated method stub
		list.remove(obj);
	}

	public void add(Object obj) {
		// TODO Auto-generated method stub
		list.add(obj);
	}

}
