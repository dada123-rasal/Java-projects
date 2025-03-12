package parameterised_method;

public class paramethod {

	//method is a group / block of code which take the input & processed it and give the output 
	//methods take n th no.of parameters inside a paranthesis
	//take care parameters 6/7
	//parameters acts as a local variable inside the method
	//you add  many parameters separated by comma
	
	
	public void m1(order o,product p)
	{
		System.out.println(o.content+" "+o.oname+" "+o.prize);
		System.out.println(p.content+" "+p.pname+" "+p.pprice);
		
	}
	//method must return a value/object when you are using the return type other than void 
	public order m2(order o)
	{
		
		return o;
	}
	
	public int add(int a,int b)
	{
		int c=a+b;
		return c;
	}
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	
	public static void main(String[] args) {
		paramethod pm=new paramethod();
		order or=new order();
		or.content=2;
		or.oname="abc";
		or.prize=77.5;
		product pr=new product();
		pr.content=22;
		pr.pname="xyz";
		pr.pprice=89.90;
		//method run only when it called
		pm.m1(or, pr);
		
		order o1=pm.m2(or);
		System.out.println("order :"+or.content+" "+or.oname+" "+or.prize);
		
		int i=pm.add(3, 10000);
       System.out.println("addition :"+i);
       int s=pm.sub(200, 433);
	   System.out.println("subtraction :"+s);
	}

}
