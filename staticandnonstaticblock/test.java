package staticandnonstaticblock;

public class test {
	
	//static block executed at the time of loading .class file into jvm memory
	//it is run only once
	//Static block can be printed without main method
	//static blocks are automatically called as soon as class is loaded in memory 
	//static blocks can also be executed before constructors.
	
	
	static {
		System.out.println("static block are automatically called");
	}
	
	//A non-static blocks are class level blocks which do not have any prototype. 
	// a non-static block is to execute any logic whenever 
	//an object is create irrespective of the constructor
	{
		System.out.println("non static block is execute an object is create irrespective of the constructor ");
	}
	
	public  static void m1() {
		System.out.println("static method");
	}

	public static void main(String[] args) {
	test t=new test();
	test.m1();

	}

}
