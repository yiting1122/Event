package com.yiting.event;

import java.util.EventListener;

/** 
 * 事件监听器，实现java.util.EventListener接口。定义回调方法，将你想要做的事 
 * 放到这个方法下,因为事件源发生相应的事件时会调用这个方法。 
 * @author yiting
 */  
public class MyEventListener implements EventListener{
	public void doBefore(MyEvent myEvent){
		System.out.println("set name  before Action "+((EventSource)myEvent.getSource()).getName());
	}
	
    public void doAfter(MyEvent myEvent){
    	System.out.println("set name  before Action "+((EventSource)myEvent.getSource()).getName());
	}

}
