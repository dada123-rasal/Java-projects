package com.abstraction;

public class demo extends test{
	

	@Override
	public void m2() 
	{
	System.out.println("this is child method overrided");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       demo d=new demo();
       System.out.println("this is child object");
       d.m2();
       d.m1();
       
       test t=new demo();
       System.out.println("parent child mix object");
       t.m1();
       t.m2();
       t.m3();
       t.m4();
       t.m5();
       t.m6();
       
             //abstraction : hidding internal details and showing functionality is known as abstraction 
              // eg. sending text message 
              //by using abstract class and interface we can achieve abstraction in java
       
             // abstract class : A class which is declared as abstract class
            //only classes and methods declared as abstract 
       		//abstract methods do not have body  and implementation 
            //this is a incomplete method\n"
       		//abstract class can have abstract and non- abstract methods 
		    //final and static method can be present in abstract class
            //abstract  class can have constructor
           //abstract class can not be declared object initiated 
           //abstract methods is a overriden by it's subclass
           //
		
		
	}

	

}
