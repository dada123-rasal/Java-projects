package staticandnonstaticblock;
public class demo {

	demo(){
		System.out.println("constructor");
	}
	static {
		System.out.println("static block called ");
	}
	{
		System.out.println("non-static block");
	}
	
	public static void main(String[] args) {
		demo d=new demo();
	}
	
}
