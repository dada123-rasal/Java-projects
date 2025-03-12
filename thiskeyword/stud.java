package thiskeyword;

public class stud extends Student {
          public void m2(int id ,String name) {
        	    
        	 super.m(id, name); 
          }
	
	
	
	public static void main(String[] args) {

			stud s=new stud();
			
			s.m2(1, "dada");
			
			System.out.println(s.id);
			System.out.println(s.name);
	

	}

}
