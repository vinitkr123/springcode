package com.scjp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		HelloWorld hello = new HelloWorld();
		// TODO Auto-generated method stub
		hello.setMessage("hello");
	
		ApplicationContext context = new ClassPathXmlApplicationContext("DispatcherServlet.xml");
		HelloWorld helloWorld = (HelloWorld) context.getBean("hello");
		
		hello = (HelloWorld) context.getBean("hello");
		hello.setMessage("set in");
		helloWorld.setMessage("Hello I am Object 1st");
		helloWorld.getMessage();
		helloWorld.getClass();	
	
		((AbstractApplicationContext) context).registerShutdownHook();
		System.out.println("Hello from Object 1 "+helloWorld.getMessage());
		//System.out.println("Hello from Object 2 "+hello.getMessage());	
		//System.out.println("Hello from Object 2 "+hello.getMessage());	
	
		InitDestroyBean initDestroyBean = (InitDestroyBean)context.getBean("initBean");
		initDestroyBean.afterPropertiesSet();
		System.out.println(initDestroyBean);
		
	}

}
