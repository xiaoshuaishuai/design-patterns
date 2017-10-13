/**  
 * 组合模式  
 * 
 * 
 抽象构件(Conponent)角色：所有类的共有接口，定义了叶子和容器的共同点。
叶子(Leaf)构件角色:在组合中表示叶子结点对象，叶子节点无子节点。
容器(Composite)构件角色：有容器特征，可以 用来存储子节点，在Component接口中实现与子节点有关操作，如增加(add)和删除 (remove)等。


拿杀毒举例
抽象构件 -杀毒
叶子leaf 文件-文本杀毒、图片杀毒
容器-文件夹存储文件

 */
package com.xs.my.design.patterns.struceturetype.assembly;