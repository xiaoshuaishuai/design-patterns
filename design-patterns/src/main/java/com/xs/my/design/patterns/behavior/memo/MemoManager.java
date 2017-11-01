package com.xs.my.design.patterns.behavior.memo;

/**
 * 备忘录管理角色
 */
public class MemoManager {

	Memo memo;

	public MemoManager(Memo memo) {
		this.memo = memo;
	}

	public Memo getMemo() {
		return memo;
	}
}
