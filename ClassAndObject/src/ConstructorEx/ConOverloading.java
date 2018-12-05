package ConstructorEx;

public class ConOverloading {
int id;
String name;
int age;
public ConOverloading(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
/**
 * @param id
 * @param name
 * @param age
 */
public ConOverloading(int id, String name, int age) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
}
void Display(){
	System.out.println(id+" "+name+" "+age);
}
public static void main(String[] args) {
	ConOverloading c=new ConOverloading(01,"anu");
	ConOverloading c1=new ConOverloading(02, "sonu",23);
	c.Display();
	c1.Display();
}
}
