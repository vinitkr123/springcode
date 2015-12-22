package com.scjp;

public class IsAandHasA {

	public static void main(String... args)
	{
		Test t1 = new Test();
		Test t2 = new Test();
		if(t1.equals(t2))
		{
			System.out.println("they are equsal"+String.valueOf(t1));
		}
		if(!t1.equals(t2))
		{ 
		System.out.println("both are not equal"+String.valueOf(new Test())+String.valueOf(t1)+String.valueOf(t2));	
		System.out.println(!t1.equals(t2));
		System.out.println(t1!=t2);
		System.out.println("Hash Code of t1 "+t1.getClass().hashCode()+t1.getClass().hashCode());
		System.out.println("Canonical Name"+t1.getClass().getCanonicalName());
		System.out.println("Class Name t1"+t1.getClass());
		}
		if(t1 instanceof Object)
		{
			System.out.println("T1 instanceof Object");
		}
		if(t1 instanceof Test)
		{
			System.out.println("T1 instanceof Test");
		}
		
	}
}
