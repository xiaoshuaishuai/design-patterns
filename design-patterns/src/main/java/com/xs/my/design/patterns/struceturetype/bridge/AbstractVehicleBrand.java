package com.xs.my.design.patterns.struceturetype.bridge;

/**
 * 1：汽车品牌抽象类，这个抽象类主要是导航的安装与启动，其它的配件也可以在该类提供方法， 但是为了开-闭原则，最好可以在另加其它接口。
 * 2：桥接就是要实现插拔方式的调用，我们想一下主板和插件，主板提供接口定义该接口的功能， 由插件来实现该接口的功能。这就是桥接的主要思想，抽象与实现分离。
 * 3：该类定义了如何注入一个接口的方法install，并定义了如何操作注入接口的具体实现的方法open。
 * 4：这里其实可以使用接口，如果使用接口，那就更灵活，以后我再给大家写一个多个接口的例子
 * ，每个配件一个接口。这样每个品牌的汽车可以实现多个接口也就可以增加不同的配件了。
 * 
 */
public abstract class AbstractVehicleBrand {
	/**
	 * 安装导航方法
	 * 
	 */
	public abstract void install(INavigator n);

	/**
	 * 开启导航 开启导航是调用导航接口实现类的方法，其实那个方法就是我们这个方法的延伸。
	 * 
	 */
	public abstract void open();
}