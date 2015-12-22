package com.scjp;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InitDestroyBean{
	 public void afterPropertiesSet() {
		Test t1 = new Test();
		System.out.println(t1);
	 }
	 public void nit()
	 {
	 	Test t1 = new Test("Vinit",27);
	 	t1.getClass();
	 	System.out.println(t1+"I an initilizating the beans");
	 }
	
	 public void destroy()
	 {
		 Test y1  = new Test();
		 System.out.println(y1+"We are destring the bean and I will no be after this");
		 
	 }
	 public String toString()
	 {
		 return "Hello I am a toString method";
	 }
}
