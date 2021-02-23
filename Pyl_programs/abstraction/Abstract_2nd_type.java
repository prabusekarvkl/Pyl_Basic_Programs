package abstraction;


public class Abstract_2nd_type { 

	public static void main(String[] args) {
	cx obj = new cx();
	obj.q();
	obj.n();
	System.out.println("abstract" +  " m");
	System.out.println("abstract"   + " p");
	}

}
  



abstract class Ax
{
	abstract void m ();
	void n()
	{
		System.out.println("n");
	}
}	
abstract class Bx  extends Ax
{
 
abstract void p(); 
   void q()
   {
	   System.out.println("q");
   }
  }
	
 class cx extends Bx
{
void m()
{
	System.out.println("abstract"+"mm");
	
}

void p()
{
	System.out.println("abstract"+   "pp");
}
	
}
	
