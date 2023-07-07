package com.slokam.beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
@Scope("request")
public class TestController implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean,DisposableBean {
    /*
	public TestController() {
		System.out.println("1.TestController Instantiation");
	}
	*/
	@Autowired
	public TestController( TestService testService) {
		System.out.println("1.TestController Instantiation");
		this.testService =testService;
	}
	
	private TestService testService;

	private String beanName;
	private BeanFactory beanFactory;
	private ApplicationContext applicationContext;

	/*
		@Autowired
		public void setTestService(TestService testService) {
			System.out.println("2. Dependency injection.");
			this.testService = testService;
		}
	*/
	
	@GetMapping
	public String test() {
		System.out.println("Test method");
		testService.test();
		System.out.println(testService);
		return "Hello";
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("3. Setting bean Name :" + name);
		this.beanName = name;
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("4. Setting BeanFactory :" + beanFactory);
		this.beanFactory = beanFactory;

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println("5. Setting ApplicationContext :" + applicationContext);
	}

	@PostConstruct
	public void ourInit() {
		System.out.println("7.1. Initialization PostConstruct");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("7.2. Initialization afterPropertiesSet");

	}
	
	
	@PreDestroy
	public void ourDestroy() {
		System.out.println("9.1. Destroy ourDestroy");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("9.2. Destroy disposal");
		
	}

}
