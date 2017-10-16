package com.xs.my.design.patterns.behavior.iterator;

public class Client {

	public static void main(String[] args) {
		
		Collection collection = new ConcreateCollection();
		collection.add("小红");
		collection.add("小李");
		collection.add("小明");
		Iterator iterator = collection.iterator();
		while(iterator.hasNext()){
			String s = (String) iterator.next();
			System.out.println(s);
		}
	}
}
