package com.array;

import java.util.Scanner;

public class arr {
	 Scanner sc=new Scanner(System.in);
	
	public void array()
	{    System.out.println("enter size");
		int size=sc.nextInt();
		int marks[]=new int[size];
		System.out.println("enter marks: ");
		for(int i=0;i<size;i++)
		{
			marks[i]=sc.nextInt();
		}
		System.out.println("display marks:");
		for(int i=0;i<size;i++)
		{
			System.out.println(marks[i]);
		}
		System.out.println("enter a search marks");
		int x=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(marks[i]==x)
			{
				System.out.println("index of marks is: "+i);
			}
		}
		
		
	}
	

	public static void main(String[] args) {

		arr ar=new arr();
		ar.array();
		
	}

}
