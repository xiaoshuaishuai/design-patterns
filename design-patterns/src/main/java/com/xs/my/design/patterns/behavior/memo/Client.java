package com.xs.my.design.patterns.behavior.memo;

public class Client {

	public static void main(String[] args) {
		Originator originator = new Originator();
		originator.setState("0");// 初始状态为0
		Memo memo = new Memo("0");

		MemoManager memoManager = new MemoManager(originator.createMemo(memo));

		System.out.println("具体状态:" + originator.getState());
		System.out.println("备忘录状态:" + memoManager.getMemo().getState());
		originator.setState("1");
		System.out.println("========================修改状态");
		System.out.println("具体状态:" + originator.getState());
		System.out.println("备忘录状态:" + memoManager.getMemo().getState());
		System.out.println("========================重置状态");
		originator.restoreMemento(memo);
		System.out.println("具体状态:" + originator.getState());
		System.out.println("备忘录状态:" + memoManager.getMemo().getState());
	}
}
