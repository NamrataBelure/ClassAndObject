package AccessModifiers;

public class PrivateModifierEx {
    public static void main(String[] args) {
	demo d=new demo();
	//d.test1();//private method cannot be used
	//d.x=5;//private variable cannot be used 
	d.show();//run properly...
}
}
class demo{
	private int x=56;
	public void show(){
		System.out.println("values:"+x);
	}
	void test1(){
		System.out.println("It can't be accessed in any other class");
	}
}
