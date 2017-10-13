package com.xs.my.design.patterns.struceturetype.assembly;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器
 * 
 * 放置叶子构件-扩充功能
 */
public class CompositeFolder implements Conponent {

	private String name;
	private List<Conponent> list = new ArrayList<Conponent>();

	public CompositeFolder(String name) {
		this.name = name;
	}

	public void add(Conponent e) {
		list.add(e);
	}

	public void remove(Conponent e) {
		list.remove(e);
	}

	public void killVirus() {
		System.out.println("对【" + name + "】杀毒");
		for (int i = 0; i < list.size(); i++) {
			list.get(i).killVirus();
		}
	}

}
