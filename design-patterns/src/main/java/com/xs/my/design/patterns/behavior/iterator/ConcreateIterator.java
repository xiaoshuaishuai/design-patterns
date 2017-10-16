package com.xs.my.design.patterns.behavior.iterator;

import java.util.List;

/**
 * 具体的迭代器
 */
public class ConcreateIterator implements Iterator {
	private List list;
	private int cursor = 0;

	public ConcreateIterator(List list) {
		this.list = list;
	}

	public boolean hasNext() {
		if (cursor == list.size()) {
			return false;
		}
		return true;
	}

	public Object next() {
		Object obj = null;
		if (this.hasNext()) {
			obj = this.list.get(cursor++);
		}
		return obj;
	}

}
