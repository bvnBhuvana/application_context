package com.slokam.beanlifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("request")
public class Test3Controller {

	@Autowired
	private TestService testService;
	
	@GetMapping("test3")
	public String test2() {
		testService.test();
		System.out.println(testService);
		return "Hello How Are You ?";
	}
	
}
