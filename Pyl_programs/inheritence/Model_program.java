package inheritence;



public class Model_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B	Bobj = new B();                       // obj = new B();
		Bobj.print  ();                      // obj.print  ();
		Bobj.display();                      //obj.display();
		                 
	}

}
                       


class A {
void print()
{
System.out.println("parent class"); 
}


}

class B extends A 
{
void display() 
{
System.out.println("child class");
}
}