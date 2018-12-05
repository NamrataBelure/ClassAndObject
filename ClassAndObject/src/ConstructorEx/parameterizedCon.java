package ConstructorEx;

public class parameterizedCon {
 int id;
 String name;

public parameterizedCon(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
void Display(){
	System.out.println(id+" "+name);
}
public static void main(String[] args) {
	parameterizedCon p=new parameterizedCon(01,"anu");
	parameterizedCon p2=new parameterizedCon(02,"sonu");
	p.Display();
	p2.Display();
    }
}
