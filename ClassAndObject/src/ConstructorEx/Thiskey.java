package ConstructorEx;

import ArrayObjects.Student;

public class Thiskey {
 int id;
 String name;
 int age;
 
public Thiskey(int id, String name) {
	super();
	this.id = id;
	this.name = name;
   }
 Thiskey(int id, String name, int age) {
		this(id, name);
		this.age = age;
	}
 void display(){
	 System.out.println(id+" "+name+" "+age);
 }
	public static void main(String[] args) {
	 Thiskey key=new Thiskey(01, "anu");
	 Thiskey key2=new Thiskey(02,"asad",3);
	 key.display();
     key2.display();
	}
}