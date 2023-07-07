package com.slokam.beanlifecycle;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class ApplicationContextEvenListener
implements ApplicationListener<ApplicationEvent>  {

	@Override
	public void onApplicationEvent(ApplicationEvent arg0) {
		System.out.println("ApplicationContextEvenListener ApplicationEvent:"+arg0.getSource());
		
	}
}
