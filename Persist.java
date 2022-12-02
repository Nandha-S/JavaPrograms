package javaPrograms;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Persist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Student s=new Student(15,"nandhu");//Creating the object 
			FileOutputStream fout=new FileOutputStream("Serial.txt");//Creating stream and writing the object
			ObjectOutputStream out=new ObjectOutputStream(fout);
			out.writeObject(s);
			out.flush();
			out.close();
			System.out.println("success....");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		}
	}

}
