package finalize;

public class demo extends Object{
      @Override
	protected void finalize() 
   {
	   System.out.println("system.gc()invoke");
   }
      public static void main(String[] args) {
		demo d1=new demo();
		demo d2=new demo();
		demo d3=new demo();
		d1=null;
		d2=null;
		d3=null;
		
		System.gc();
	
		System.out.println("success");
	}
}
