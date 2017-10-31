package com.xs.my.design.patterns.struceturetype.adapter.cls_extend;

public class Customer {

	public static void main(String[] args) {
		// 普通功能
		Target general = new GeneralTarget();
		general.request();
		// 通过适配器
		Target adapter = new Adapter();
		adapter.request();
	}

}
