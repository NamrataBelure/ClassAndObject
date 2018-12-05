package ConstructorEx;

public class CopyCon {
	int id;
	String name;
	int age;
	
	public CopyCon(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public CopyCon(CopyCon c)
	{
		this.id = c.id;
		this.name =c.name;
		this.age = c.age;
	}
	void display(){
		System.out.println(id+" "+name+" "+age);
	}
	public static void main(String[] args) {
		CopyCon c1=new CopyCon(01, "anu", 3);
		CopyCon c2=new CopyCon(c1);
		c1.display();
		c2.display();
		
	}
}
