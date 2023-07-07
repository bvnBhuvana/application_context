package com.slokam.beanlifecycle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeanLifeCycleApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanLifeCycleApplication.class, args);
	}
	
	@Bean
	public ApplicationContextEventListener2 applicationContextEventListener2() {
		return new ApplicationContextEventListener2();
	}

}
