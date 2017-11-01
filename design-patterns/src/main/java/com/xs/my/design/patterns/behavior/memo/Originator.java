package com.xs.my.design.patterns.behavior.memo;

/**
 * 发起人
 */
public class Originator {
	private String state = "";

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	//创建备忘录
	public Memo createMemo(Memo memo) {
		return new Memo(this.state);
	}
	//恢复备忘录
    public void restoreMemento(Memo memo){  
        this.setState(memo.getState());  
    }  
}
