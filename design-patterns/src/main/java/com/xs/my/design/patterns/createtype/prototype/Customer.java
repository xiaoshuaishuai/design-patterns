package com.xs.my.design.patterns.createtype.prototype;

public class Customer {
	/**
	 * 
	 * 克隆满足的条件
	 * clone()方法将对象复制了一份并返还给调用者。所谓“复制”的含义与clone()方法是怎么实现的。一般而言，clone()方法满足以下的描述：
	 * 
	 * （1）对任何的对象x，都有：x.clone()!=x。换言之，克隆对象与原对象不是同一个对象。
	 * 
	 * （2）对任何的对象x，都有：x.clone().getClass() == x.getClass()，换言之，克隆对象与原对象的类型一样。
	 * 
	 * （3）如果对象x的equals()方法定义其恰当的话，那么x.clone().equals(x)应当成立的。
	 * 
	 * 在JAVA语言的API中，凡是提供了clone()方法的类，都满足上面的这些条件。JAVA语言的设计师在设计自己的clone()方法时，
	 * 也应当遵守着三个条件。一般来说，上面的三个条件中的前两个是必需的，而第三个是可选的。
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Prototype p = new Prototype();
		for (int i = 0; i < 10; i++) {
			Prototype newP = p.clone();
			System.out.println(p == newP);//不是同一个对象 false
			System.out.println(p.getClass() == newP.getClass());//对象类型相同 true
		}

	}

}
