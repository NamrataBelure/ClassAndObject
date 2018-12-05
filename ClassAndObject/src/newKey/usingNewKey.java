package newKey;

public class usingNewKey {
	
		public static void main(String[] args) {
			test t=new test();//all object are dynamically allocate
			t.show();//run properly...
		}
	}
	class test{
	void show(){
		System.out.println("hello");
	}
}

