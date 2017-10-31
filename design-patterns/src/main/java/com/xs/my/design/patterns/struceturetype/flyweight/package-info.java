/**    
 * 享元模式
 * 
 * 享元模式（Flyweight Pattern），又称轻量级模式（这也是其英文名为FlyWeight的原因），通过共享技术有效地实现了大量细粒度对象的复用。
 * 
 * 只要应用于实例复用，将实例的创建获取统一放至容器管理
 * 
 * 
 * 享元模式角色划分
FlyWeight 享元接口或者（抽象享元类），定义共享接口
ConcreteFlyWeight 具体享元类，该类实例将实现共享
UnSharedConcreteFlyWeight 非共享享元实现类
FlyWeightFactory 享元工厂类，控制实例的创建和共享
 * 
 */
package com.xs.my.design.patterns.struceturetype.flyweight;