package com.yiting.event;

import java.util.EventObject;

/***
 * 事件类 ：描述某个事件的所有属性和相关动作。比如定义键盘事件类KeyEvent来描述键盘事件的所有信息，
 * 如键是否按下、是否释放、是否双击，以及相关键的信息，如键码，是否有组合键等等。
 * 
 * @author kingsoft
 * 
 */
public class MyEvent extends EventObject {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static final int BEFORE = 1;
	public static final int AFTER = 2;

	public MyEvent(Object source) {
		super(source);
	}

	public void setSource(Object source) {
		this.source = source;
	}

}
