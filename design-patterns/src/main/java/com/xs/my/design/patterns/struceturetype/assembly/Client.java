package com.xs.my.design.patterns.struceturetype.assembly;

public class Client {

	public static void main(String[] args) {

		CompositeFolder conponent = new CompositeFolder("我的文档");
		conponent.add(new TextLeaf("文本.txt"));
		conponent.add(new ImageLeaf("图片.gif"));
		conponent.killVirus();

	}
}
