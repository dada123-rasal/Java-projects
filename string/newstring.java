package com.string;

public class newstring {

	public static void main(String[] args) {
		//String is sequence of character,String is immutable which means constant
		//and can not change once created
		//String is final and thread safe
		//String class define in java.lang pack.
		//there are two ways to creating String 
		//1.literal
		//2.by using new keyword
		//literal obj store in heap memory on constant pool area
		//literal obj always save memory
		String s="hello";//literal way
		s.concat("not change");  //immutable ,not change
		System.out.println(s);
		s=s.concat("  change");
		System.out.println("new ref  :"+  s);


		//new keyword obj store in heap  memory 
		//it is always creating new memory
		
		String s2=new String("hello");//new keyword use
          //intern() is use to create exact copy of heap string obj in the string constant pool
		String s3=new String ("hello").intern();
		System.out.println("s2  "+s2 );
		System.out.println("s3  intern method :"+s3);
	
		
		//Stringbuffer is a thread safe and mutable class
		StringBuffer sb=new StringBuffer("hi");
		System.out.println(sb);
		//there are some methods
		System.out.println(sb.append(" hello"));//hi hello
		System.out.println(sb.reverse());
		System.out.println(sb.length());
		System.out.println(sb.getClass());
		//Stringbuilder is not a thread safe 
		//it is mutable class
       StringBuilder sbd=new StringBuilder("StringBuilder");
       System.out.println(sbd);
	}

}
