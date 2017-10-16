/**    
 * 策略模式
 * 
 * 把一个类中经常改变或者将来可能改变的部分提取出来，作为一个接口，然后在类中包含这个对象的实例，这样类的实例在运行时就可以随意调用实现了这个接口的类的行为。
比如定义一系列的算法,把每一个算法封装起来, 并且使它们可相互替换，使得算法可独立于使用它的客户而变化。这就是策略模式。


if else if else ...硬编码用策略模式解决

角色：
环境类(Context):用一个ConcreteStrategy对象来配置。维护一个对Strategy对象的引用。可定义一个接口来让Strategy访问它的数据。
抽象策略类(Strategy):定义所有支持的算法的公共接口。 Context使用这个接口来调用某ConcreteStrategy定义的算法。
具体策略类(ConcreteStrategy):以Strategy接口实现某具体算法。
 */
package com.xs.my.design.patterns.behavior.strategy;