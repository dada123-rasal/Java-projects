package com.array2d;

import java.util.Scanner;

public class Twodimensionalarray {
Scanner sc=new Scanner (System.in);
	public void twodarr()
	{ 
		System.out.println("enter row");
		int row=sc.nextInt();
		System.out.println("enter columns");
		int col=sc.nextInt();
		int num[][]=new int[row][col];
		System.out.println("enter numbers");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				num[i][j]=sc.nextInt();
			}
			System.out.println();
		}
		System.out.println("display numbers");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
			System.out.print(num[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("enter search number");
		int x=sc.nextInt();
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(num[i][j]==x)
				{		
			
			System.out.print(i+","+j);
			}
			}
		}
	}
	public static void main(String[] args) {
		Twodimensionalarray ar=new Twodimensionalarray();
		ar.twodarr();
	}

}
