package AccessModifiers;

public class DefaultModifierEx {
    
	int x=56;//implict default accesses modifier
	void show(){
		System.out.println("values:"+ x);
	}
	
	public static void main(String[] args) {
	   DefaultModifierEx d=new DefaultModifierEx();
	   d.show();
 }
}
