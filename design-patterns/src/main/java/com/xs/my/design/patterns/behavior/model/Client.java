package com.xs.my.design.patterns.behavior.model;

public class Client {

	public static void main(String[] args) {
		AbstractPerson student = new Student();
		student.go();
		AbstractPerson teacher = new Teacher();
		teacher.go();
	}
}
