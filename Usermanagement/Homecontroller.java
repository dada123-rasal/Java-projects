package com.Usermanagement;

import java.util.Scanner;

public class Homecontroller {

	public static void main(String[] args) {
		serviceimpl si=new serviceimpl();
		

		Scanner sc=new Scanner(System.in);
		
		boolean flag=true;
		while(flag)
		{
			System.out.println("1.adduser");
			System.out.println("2.DisplayAllUser");
			System.out.println("3.DisplaySingleUser");
			System.out.println("4.UpdateUserDetails");
			System.out.println("5.DeleteUserDetails");
			System.out.println("6.stop");
			
			System.out.println("ENTER YOUR CHOICE");
			int number=sc.nextInt();
		
			switch(  number)
			{
		
			case 1 :    si.AddUser();
			break;
			case 2 :  si.DisplayAllUser();
			break;
			case 3 :     si.DisplaySingleUser();
			break;
			case 4 :   si.UpdateUserDetails();
			break;
			case 5 :    si.DeleteUserDetails();
			break;
			case 6 :   flag=false;
			          System.out.println("stop application");
			break;
			default:System.out.println("not match");
			} 
       	}
	}
}
