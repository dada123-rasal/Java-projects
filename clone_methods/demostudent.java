package clone_methods;

public class demostudent {

	public static void main(String[] args) throws CloneNotSupportedException
	{
		Student s1=new Student();
		s1.setId(1);
		s1.setName("sham");
		Student s2=s1.clone();
		
System.out.println("s1"+s1 +""+s1.hashCode());
System.out.println("s2"+s2+""+s2.hashCode());

	}

}
