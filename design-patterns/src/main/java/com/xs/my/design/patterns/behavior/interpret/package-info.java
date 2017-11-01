/**    
 * 解释器模式
 * Interpreter是一种特殊的设计模式，它建立一个解释器，对于特定的计算机程序设计语言，用来解释预先定义的文法。简单地说，Interpreter模式是一种简单的语法解释器构架。

Context
    解释器上下文环境类。用来存储解释器的上下文环境，比如需要解释的文法等。
AbstractExpression
    解释器抽象类。
ConcreteExpression
    解释器具体实现类。
 */
package com.xs.my.design.patterns.behavior.interpret;