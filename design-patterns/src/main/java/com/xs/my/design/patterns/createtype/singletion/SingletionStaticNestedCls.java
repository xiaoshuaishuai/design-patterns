package com.xs.my.design.patterns.createtype.singletion;

/**
 * 静态内部类 -推荐写法
 * 这种写法仍然使用JVM本身机制保证了线程安全问题；由于 SingletonHolder 是私有的，除了 getInstance() 之外没有办法访问它，因此它是懒汉式的；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本。
 * 
 */
public class SingletionStaticNestedCls {

	private static class SingletionHolder {
		private static final SingletionStaticNestedCls singletion = new SingletionStaticNestedCls();
	}

	private SingletionStaticNestedCls() {
	}

	public static final SingletionStaticNestedCls getSingletion() {
		return SingletionHolder.singletion;
	}
}
