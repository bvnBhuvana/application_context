package com.slokam.beanlifecycle;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;
@Component 
public class ApplicationContextEventListener5 implements
ApplicationListener<ContextClosedEvent>{
	@Override
	public void onApplicationEvent(ContextClosedEvent event) {
		System.out.println("ContextClosedEvent event");
	}
}
