package com.Usermanagement;

import java.util.Scanner;

public class serviceimpl implements userserviceinterface{

	int n;
	
	Scanner sc=new Scanner(System.in);
	
	User u[] =new User[5];
	
	@Override
	public void AddUser() {
		
		System.out.println("how many users you want to add");
		n=sc.nextInt();
		
		for(int i=0;i<=n;i++)
		{
			User user=new User();
			System.out.println("Enter the uid");
			user.setUid(sc.nextInt());
			System.out.println("Enter the uname");
			user.setUname(sc.next());
			System.out.println("Enter the uaddress");
			user.setUaddress(sc.next());
			System.out.println("Enter the usalary");
			user.setSalary(sc.nextDouble());
			
			u[i]=user;
			System.out.println("user added successfully in index :"+  i);
			
			
			
		} 
		
	}

	@Override
	public void DisplayAllUser() {
		System.out.println("All users");
		for (User user : u) {
			System.out.println(user);
		}
	}

	@Override
	public void DisplaySingleUser() {
		System.out.println("Enter the user id");
		int id=sc.nextInt();
		for (User user : u) {
			if(user!=null&&(user.getUid()==id))
			{
				System.out.println(user);
			}
		}
		
	}

	@Override
	public void UpdateUserDetails() {
		System.out.println("ENTER THE USER ID");
		int id=sc.nextInt();
		for (User user : u) {
			if(user!=null&&user.getUid()==id)
			{  System.out.println(user);
			boolean flag=true;
			while(flag)
			   {
				System.out.println("1.user name");
				System.out.println("2.user address");
				System.out.println("3.salary");
				System.out.println("4.stop");
				
				System.out.println("ENTER YOUR CHOICE");
				user.setUid(user.getUid());
								int number =sc.nextInt();
		     					switch(number)
		     					{
		     					
		     					case 1:			System.out.println("Enter the user name");
											user.setUname(sc.next());
								break;
								
		     					case 2:			System.out.println("Enter the user address");
											user.setUaddress(sc.next());
								break;
										
		     					case 3:           System.out.println("Enter the user salary");
											user.setSalary(sc.nextDouble());
								break;			
								
		     					case 4:    flag=false;
		     					break;
		     					
		     					default: System.out.println("not match");
		     					}				
				
			            }
			}
		}
		
	}

	@Override
	public void DeleteUserDetails() {
		System.out.println("Enter the id you want to DELETE");
		int id=sc.nextInt();
		int index=0;
		for (int i=0;i<=u.length;i++) {
			if(u[i]!=null&&u[i].getUid()==id)
			{
				index=i;
				break;
			}
		}
		u[index]=null;
		System.out.println("DELETED successfully");
	}

	
	
	
	
}
