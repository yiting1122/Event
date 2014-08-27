package com.yiting.event;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 事件源。事件发生的地方，由于事件源的某项属性或状态发生了改变(比如BUTTON被单击、TEXTBOX的值发生改变等等)导致某项事件发生。
 * 换句话说就是生成了相应的事件对象。因为事件监听器要注册在事件源上,所以事件源类中应该要有盛装监听器的容器(List,Set等等)。
 * 
 * @author kingsoft
 * 
 */
public class EventSource {
	private String name;   //以name的改变触发事件的发送
	private Set<MyEventListener> listeners;

	public EventSource() {
		listeners = new HashSet<MyEventListener>();
		this.name = "default";
	}

	public void addListeners(MyEventListener listener) {
		listeners.add(listener);
	}

	public void notifyBeforeEvent() {
		Iterator<MyEventListener> iterator = this.listeners.iterator();
		while (iterator.hasNext()) {
			MyEventListener eventListener = iterator.next();

			eventListener.doBefore(new MyEvent(this));
		}
	}

	public void notifyAfterEvent() {
		Iterator<MyEventListener> iterator = this.listeners.iterator();
		while (iterator.hasNext()) {
			MyEventListener eventListener = iterator.next();
			eventListener.doAfter(new MyEvent(this));
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!this.name.equals(name)) {
			notifyBeforeEvent();
			this.name = name;
			notifyAfterEvent();
		}
	}

}
