package com.scjp;

public class Test {

	int age ; String name;
	Test(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	public Test() {
		// TODO Auto-generated constructor stub
	}
	public String toString()
	{
			return ("I am Sunny, but you can call me "+name+ " my age is "+age);
	}
}
