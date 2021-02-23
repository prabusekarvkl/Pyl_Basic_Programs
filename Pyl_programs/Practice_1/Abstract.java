package Practice_1;

public class Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ya j=new ya();
j.m();
j.add();
j.sub();	
j.n();
		
	}

}
abstract class za
{
	abstract void m();
	 abstract void  n();
	 void add()
	 {
		 System.out.println("add");
	 }
	 }

class ya extends za
{
	 void m()
	 {
		System.out.println("m"); 
	 }
	  void  n()
	  {
		  System.out.println("n");
	  }
	 void sub()
	 {
		 System.out.println("sub");
	 }
	 }    