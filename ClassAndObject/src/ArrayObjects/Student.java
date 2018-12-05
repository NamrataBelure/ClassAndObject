package ArrayObjects;

import java.io.DataInputStream;
import java.io.IOException;

public class Student {
	int rno;
 String city;
 String name;

public Student(int rno, String city, String name) {
	super();
	this.rno = rno;
	this.city = city;
	this.name = name;
}




	public static void main(String[] args) throws IOException {
	
    	DataInputStream ds=new DataInputStream(System.in);
    	Student[]s=new Student[3];
    	int i;
    	for ( i = 0; i <3; i++) {
    		System.out.println("Enter the rollno:");
    		int no=Integer.parseInt(ds.readLine());
			System.out.println("Enter the city:");
			String city=ds.readLine();
			System.out.println("Enter ur name:");
			String name=ds.readLine();
			s[i]=new Student(no, name, city);
			System.out.println("successfully saved...");
    	}
  }
}
