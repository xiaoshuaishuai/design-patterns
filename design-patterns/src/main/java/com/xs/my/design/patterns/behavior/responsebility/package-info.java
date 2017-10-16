/**   
 * 责任链模式 
 * 
 * 定义：使多个对象都有机会处理请求，从而避免了请求的发送者和接收者之间的耦合关系。将这些对象连成一条链，并沿着这条链传递该请求，直到有对象处理它为止。

抽象处理类：抽象处理类中主要包含一个指向下一处理类的成员变量nextHandler和一个处理请求的方法handRequest，handRequest方法的主要主要思想是，如果满足处理的条件，则有本处理类来进行处理，否则由nextHandler来处理。
具体处理类：具体处理类主要是对具体的处理逻辑和处理的适用条件进行实现。

filter过滤器是典型的责任链模式
 */
package com.xs.my.design.patterns.behavior.responsebility;