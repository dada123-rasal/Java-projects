package com.abstraction;

public abstract class test {
 
	test(){
		System.out.println("constructor");
	}
	// abstract class have abstract and non-abstract methods
	//we do not create object of abstract class 
	
	public void m1()
	{
		System.out.println("non abstract method");
	
	}
	
	
	 abstract void m2();
	public static void m3() {
		System.out.println("static method in abstract class");
	}
	
	public final void m4() {
		System.out.println("final method in abstract class ");
	}
	public static final void m5() {
		System.out.println("static final in abstract");
	}
	protected final static void m6() {
		System.out.println("final static in abstract");
	}
	{
		System.out.println("non-static in abstract");
	}
}
