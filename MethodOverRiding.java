package com.cisco.polymorphism;

public class MethodOverRiding 
{
	public void test() 
	{
		System.out.println("This is Parent class Test Method");
	}
	
}

class Child extends MethodOverRiding
{
	public void test() 
	{
		super.test(); //can call parent method
		System.out.println("This is Child Class Method");
	}
}

public class MethodOverRiding extends Child
{
	
	public static void main(String[] args) 
	{
		
		Child c= new Child();
		//c.test();
		
		MethodOverRiding p= new MethodOverRiding();
		//p.test();
		
		MethodOverRiding p1= new Child();
		p1.test();
		
		
		//this type of initialization is used to access only the members
		//present in parent class and methods are overridden in the child class
		//this is called upcasting
	}

}
