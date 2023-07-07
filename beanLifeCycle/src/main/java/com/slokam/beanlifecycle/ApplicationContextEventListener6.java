package com.slokam.beanlifecycle;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.support.RequestHandledEvent;
@Component
public class ApplicationContextEventListener6 implements 
ApplicationListener<RequestHandledEvent>{
	@Override
	public void onApplicationEvent(RequestHandledEvent event) {
		System.out.println("RequestHandledEvent event");
	}
}
