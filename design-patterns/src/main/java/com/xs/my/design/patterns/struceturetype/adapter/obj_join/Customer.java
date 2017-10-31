package com.xs.my.design.patterns.struceturetype.adapter.obj_join;

public class Customer {

	public static void main(String[] args) {
		// 普通功能
		Target general = new GeneralTarget();
		general.request();
		// 通过适配器
		Target adapter = new Adapter(new Adaptee());
		adapter.request();
	}

}
