package Agregation;

public class mainclass {

	public static void main(String[] args) {
	Course course =new Course();
	course.setCid(1);
	course.setCname("java");
	
	Faculty faculty=new Faculty();
	faculty.setFid(11);
	faculty.setFname("ajay sir");
	faculty.setC(course);
	
	Batch batch =new Batch();
	batch.setBid(21);
	batch.setBname("morning");
	batch.setF(faculty);
	
	Student student =new Student();
	student.setSid(31);
	student.setSname("raj");
	student.setB(batch);

	
	System.out.println(student.getB().getF().getC().getCid());
	System.out.println(student.getB().getF().getC().getCname());
	System.out.println(student.getB().getF().getFid());
	System.out.println(student.getB().getF().getFname());
	System.out.println(student.getB().getBid());
	System.out.println(student.getB().getBname());
	System.out.println(student.getSid());
	System.out.println(student.getSname());
	

	

	

	
	
	
	}

}
