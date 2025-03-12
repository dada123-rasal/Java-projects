package settergetterproject;

public class colleage {
      
	public void colleage()
	{
		Student s=new Student();
		s.setSid(1);
		s.setName("dada");
		s.setAddress("pune");
		
		Student s1=new Student();
		s1.setSid(2);
		s1.setName("ram");
		s1.setAddress("nagar");
		
		unniversity un=new unniversity();
		un.display(s,s1);
		
		
	}
	
}
