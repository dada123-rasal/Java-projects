package com.patterns;

public class Pattern {
/*	
	1 
	2 3 
	4 5 6 
	7 8 9 10 
	11 12 13 14 15 
*/
public void number() 
{
	   int num=1;
      for(int i=1;i<=5;i++)
      {
    	  for(int j=1;j<=i;j++) 
    	  {
    		  System.out.print(num+" ");
    		  num++;
    	  }
    	  System.out.println();
    	  
      }
}
/*
15 
14 13 
12 11 10 
9  8  7  6  
5  4  3  2  1 
*/
    public void number2() 
    {
    int	num=15;
    for(int i=5;i>=1;i--)
    {
    	for(int j=5;j>=i;j--) 
      {  
    		
    	if(num<=9&&num>=1)
    	{
    		System.out.print(num+"  ");
    	}else
    	{
    		System.out.print(num+" ");
    	}	
    	
    	num--;
    	}
    	System.out.println();
    }
    }  
 /*
    * * * * * 
    * * * * 
    * * * 
    * * 
    * 
 */
   public void pattern3()
   {
	   for(int i=5;i>=1;i--) 
	   
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print("* ");
		   }System.out.println();
	   }
   }
  /*
   
   * 
   * * 
   * * * 
   * * * * 
   * * * * * 
*/
   public void pattern4()
   {
	   for(int i=1;i<=5;i++) 
	   
	   {
		   for(int j=1;j<=i;j++)
		   {
			   System.out.print("* ");
		   }System.out.println();
	   }
   }
 /*    
   
   * * * * * 
   *       * 
   *       * 
   *       * 
   * * * * * 
     
 */
	public void pattern5()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==1||i==5||j==1||j==5)
				{
					System.out.print("* ");
				}else
				{ 
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
/*	
	1 
	0 1 
	1 0 1 
	0 1 0 1 
	1 0 1 0 1 
*/
	public void pattern6()
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				int s=i+j;
				if(s%2==0) {
					System.out.print("1 ");
				}else
				{
					System.out.print("0 ");
				}
				
			}
			System.out.println();
		}
	}
	/*
	1 
	1 2 
	1 2 3 
	1 2 3 4 
	1 2 3 4 5 

*/
	 public void pattern7()
	   {
		   for(int i=1;i<=5;i++) 
		   
		   {
			   for(int j=1;j<=i;j++)
			   {
				   System.out.print(j+" ");
			   }System.out.println();
		   }
	   }
/*
	 1 2 3 4 5 6 7 8 9 10 
	 2 4 6 8 10 12 14 16 18 20 
	 3 6 9 12 15 18 21 24 27 30 
	 4 8 12 16 20 24 28 32 36 40 
	 5 10 15 20 25 30 35 40 45 50 
	 6 12 18 24 30 36 42 48 54 60 
	 7 14 21 28 35 42 49 56 63 70 
	 8 16 24 32 40 48 56 64 72 80 
	 9 18 27 36 45 54 63 72 81 90 
	 10 20 30 40 50 60 70 80 90 100 
*/
	 public void number5()
	 {
		 int num=1;
		 for(int i=1;i<=10;i++)
		 {
			 for(int j=1;j<=500;j++)
			 {
				  
				 int mod=num*j;
				 System.out.print(mod+" ");
			 } 
			 System.out.println();
			 num++;
			 
		 }
		 
	 }
/*	 
	 *        *
	 **      **
	 ***    ***
	 ****  ****
	 **********
	 **********
	 ****  ****
	 ***    ***
	 **      **
	 *        *
*/
	 public void pattern8()
	 {
		 int n=5;
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++) 
			 {
				 System.out.print("*");
			 }
			 int space=2*(n-i);
			 for(int j=1;j<=space;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
		 for(int i=n;i>=1;i--)
		 {
			 for(int j=1;j<=i;j++) 
			 {
				 System.out.print("*");
			 }
			 int space=2*(n-i);
			 for(int j=1;j<=space;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 
	 
	 }
	 public void pattern9()
	 {
		 int n=5;
		 for(int i=1;i<=n;i++)
		 {
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("  ");
				 
			 }
			 int star=2*(n-i);
			 for(int j=1;j<=star;j++)
			 {
				 System.out.print("* ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("  ");
			 }
			 System.out.println();
		 }
			 
	 }
	 public void num()
	 {
		int num=1;
	 for(int i=1;i<=10;i++)
	 {
		 for(int j=1;j<=40;j++)
		 {
			 System.out.print(num+" ");
			 num++;
		 }
		 
		 System.out.println();
	 }
	 }	
/*
              *****
             *****
            *****
           *****
          *****
*/
	  
	 public void pattern10()
	 {
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=5-i;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=1;j<=5;j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }
	 }
	 /*
	    1 
	    2 2 
	   3 3 3 
	  4 4 4 4 
	 5 5 5 5 5 
*/	 
	 public void num2()
	 {
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=5-i;j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print(i+" ");
			 }
			 System.out.println();
		 }
	 }
	 
	 public void num3()
	 {
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=5-i;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=i;j>=1;j--)
			 {
				 System.out.print(j+" ");
			 }
			 for(int j=2;j<=i;j++)
			 {
				 System.out.print(j+" ");
			 }
			 System.out.println();
		 }
	 }
/*	 
              * * 
            * * * * 
          * * * * * * 
        * * * * * * * * 
      * * * * * * * * * * 
      * * * * * * * * * * 
        * * * * * * * * 
          * * * * * * 
            * * * * 
              * * 
*/
	 public void diamond()
	 {
		 for(int i=1;i<=5;i++)
		 {
			 for(int j=1;j<=5-i;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=1;j<=i;j++) 
			 {
				 System.out.print("* ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
		 for(int i=5;i>=1;i--)
		 {
			 for(int j=1;j<=5-i;j++)
			 {
				 System.out.print("  ");
			 }
			 for(int j=1;j<=i;j++) 
			 {
				 System.out.print("* ");
			 }
			 for(int j=1;j<=i;j++)
			 {
				 System.out.print("* ");
			 }
			 System.out.println();
		 }
	 }
	 public void abcd()
	 {
		 for(char i='A';i<='Z';i++)
		 {
			 System.out.println(i);
		 }
	 }
public static void main(String[] args) {

	Pattern p=new Pattern();
	//p.number();
	//System.out.println();
	//p.number2();
	//p.pattern3();
	//p.pattern4();
	//p.pattern5();
	//p.pattern6();
	//p.pattern7();
	//p.number5();
	//p.pattern8();
	//p.pattern9();
	//p.num();
	//p.pattern10();
	//p.num2();
	//p.num3();
	//p.diamond();
	p.abcd();
}

}


