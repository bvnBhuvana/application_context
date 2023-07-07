package com.slokam.beanlifecycle;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("session")
public class TestService {

	public void test() {
		System.out.println("test method in service");
	}
}
