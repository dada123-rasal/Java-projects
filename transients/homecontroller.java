package transients;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class homecontroller {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
	inheritSerilize s1= new inheritSerilize();
	s1.setSid(1);
	s1.setName("dada");
	s1.setPassword("1234");
	s1.setIid(2);
	s1.setName("rasal");
	
	FileOutputStream file=new FileOutputStream("stu.txt");
	ObjectOutputStream obj=new ObjectOutputStream(file);
	obj.writeObject(s1);
	System.out.println("success");
	
	FileInputStream d=new FileInputStream("stu.txt");
	ObjectInputStream  oi=new ObjectInputStream(d);
	Student s12=(Student) oi.readObject();
	System.out.println(s12);
	System.out.println("//transient is used to avoid serilization \r\n" + 
			"	//if any object is defined as a transient then will not be serilize");

	}

}
