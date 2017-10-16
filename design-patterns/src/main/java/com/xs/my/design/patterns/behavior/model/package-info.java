/**   
 * 模板方法模式
 * 
 *  模板方法模式，即处理某个流程的代码已经都具备，但是其中某个节点的代码暂时不能确定。因此采用模板方法模式，将这个节点的代码实现转移给子类去完成。即：处理步骤父类已经定义好了，具体实现延迟到子类中去定义。
 *  
 *  使用场景：实现一个算法是，整体步骤很固定。但是，某些部分易变。易变部分可以抽象出来，供子类去实现。
优点： 
模板方法模式通过把不变的行为搬移到超类，去除了子类中的重复代码。
子类实现算法的某些细节，有助于算法的扩展。
通过一个父类调用子类实现的操作，通过子类扩展增加新的行为，符合“开放-封闭原则”。
缺点： 每个不同的实现都需要定义一个子类，这会导致类的个数的增加，设计更加抽象。
模式中的角色
抽象类（AbstractClass）：实现了模板方法，定义了算法的骨架。
具体类（ConcreteClass)：实现抽象类中的抽象方法，已完成完整的算法。
 *  
 */
package com.xs.my.design.patterns.behavior.model;