package com.serilizable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import transients.Student;

public class studentserilze {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Serilize s=new Serilize();
		s.setId(1);
		s.setName("dada");
		s.setPassword("1234");
		//serilize -it is a process of converting java object into byte stream 
		//serilize is use because security purpose
		//creating  class  and implements serilizable marker interface 
		// marker interface means empty interface
		//marker interface provide extra information and instruction into jvm at run time
		//fileOutputstream is a class in java.io package and creating file to store information
		//it is throws file not found exception 
		FileOutputStream file =new FileOutputStream("student.txt");
		
		//file object put in the objectoutputStream
		//objectoutputstream  throws ioexception
		//obj are many methods ex.writeobject();
		ObjectOutputStream obj=new ObjectOutputStream(file);
		obj.writeObject(s);
		System.out.println("success");
		
		//deseriliazation -byte stream -real java object
		
		//deseriliazation is converting byte stream into real java object
		//FileInputStream is a class in java.io package
		FileInputStream d=new FileInputStream("student.txt");
		ObjectInputStream  oi=new ObjectInputStream(d);
		//deseriliazation method is readobject();
		Student s1=(Student) oi.readObject();
		System.out.println(s1);

	}

}
