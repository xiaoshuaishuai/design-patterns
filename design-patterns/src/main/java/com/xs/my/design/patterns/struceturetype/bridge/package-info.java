/**    
 * bridge 桥接模式
 * 　将抽象部分与实现部分分离，使它们都可以独立的变化。
 * 
 * 松耦合  通过bridge桥 连接
 * 
 * 处理多维度变化
 * 
1.Client 调用端

这是Bridge模式的调用者。

2.抽象类（Abstraction）

抽象类接口（接口这货抽象类）维护队行为实现（implementation）的引用。它的角色就是桥接类。

3.Refined Abstraction

这是Abstraction的子类。

4.Implementor

行为实现类接口（Abstraction接口定义了基于Implementor接口的更高层次的操作）

5.ConcreteImplementor

Implementor的子类
 * 
 */
package com.xs.my.design.patterns.struceturetype.bridge;