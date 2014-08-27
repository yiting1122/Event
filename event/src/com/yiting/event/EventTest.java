package com.yiting.event;

import static org.junit.Assert.*;

import org.junit.Test;

public class EventTest {

	@Test
	public void test() {
		EventSource source=new EventSource();
		source.addListeners(new MyEventListener());
		source.addListeners(new MyEventListener());
		source.setName("yiting");
		source.setName("youyou");
	}

}
