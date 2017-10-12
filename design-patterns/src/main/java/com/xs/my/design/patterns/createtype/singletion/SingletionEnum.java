package com.xs.my.design.patterns.createtype.singletion;
/**
 * 对于一个标准的enum单例模式，最优秀的写法还是实现接口的形式:
 * 
枚举类实现其实省略了private类型的构造函数
枚举类的域(field)其实是相应的enum类型的一个实例对象

 */
public enum SingletionEnum implements MySingletion {
	singletion{//实例对象
		
		public void dosomething() {
			// TODO Auto-generated method stub
			System.out.println("使用枚举单列dosth()");
		}
		
	};
	
	public static MySingletion getSingletion(){
		return SingletionEnum.singletion;
	}
}
