/**
 * 简单工厂模式
 * 简单工厂模式包含如下角色：

Factory：工厂角色
工厂角色负责实现创建所有实例的内部逻辑

Product：抽象产品角色
抽象产品角色是所创建的所有对象的父类，负责描述所有实例所共有的公共接口

ConcreteProduct：具体产品角色
具体产品角色是创建目标，所有创建的对象都充当这个角色的某个具体类的实例。


缺点：每新增一个产品都要去改变工厂类

解决方案：工厂方法模式
 */
package com.xs.my.design.patterns.createtype.factory.simple;