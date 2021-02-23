package abstraction;

public class Basic_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	B obj=new B();
	 obj.m();
	 obj.n();
		
	}

}
 abstract class A
 {
	 abstract void m();
	 abstract void  n();
 }


 
 
 class B extends A
 {
	void m()
	{
	System.out.println("a");	
	}
	
	void n()
	{
	System.out.println("b");	
	}
	
	
 }