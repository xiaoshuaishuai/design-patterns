/** 
 * 备忘录模式 memo
 *  我们在编程的时候，经常需要保存对象的中间状态，当需要的时候，可以恢复到这个状态。比如，我们使用Eclipse进行编程时，假如编写失误（例如不小心误删除了几行代码），我们希望返回删除前的状态，便可以使用Ctrl+Z来进行返回。这时我们便可以使用备忘录模式来实现。
 
备忘录模式的结构
发起人：记录当前时刻的内部状态，负责定义哪些属于备份范围的状态，负责创建和恢复备忘录数据。
备忘录：负责存储发起人对象的内部状态，在需要的时候提供发起人需要的内部状态。
管理角色：对备忘录进行管理，保存和提供备忘录。   
 */
package com.xs.my.design.patterns.behavior.memo;