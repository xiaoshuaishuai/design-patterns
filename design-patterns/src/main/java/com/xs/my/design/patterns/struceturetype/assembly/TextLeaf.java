package com.xs.my.design.patterns.struceturetype.assembly;
/**
 * 叶子构件 leaf
 * 
 */
public class TextLeaf implements Conponent{

	private String name;
	
	public TextLeaf(String name) {
		this.name = name;
	}

	public void killVirus() {
		System.out.println("对【"+name+"】杀毒");
	}

}
