package Interview_program;

public class Dynamic_binding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		   
		    ABC c=new B();
		    c.m();
	}

}
class ABC
{
	void m()
	{
		System.out.println("im class A");
	
	}
}

class B extends ABC
{
	void m()
	{
		System.out.println("im class B");
	}
}