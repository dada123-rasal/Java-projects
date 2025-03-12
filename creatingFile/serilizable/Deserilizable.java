package com.serilizable;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserilizable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream file=new FileInputStream("student.txt");
        ObjectInputStream obj=new ObjectInputStream(file);
          Serilize serilize= (Serilize)obj.readObject();
          System.out.println(serilize);
	}

}
