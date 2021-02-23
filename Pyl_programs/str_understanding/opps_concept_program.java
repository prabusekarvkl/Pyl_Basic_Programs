package str_understanding;




public class opps_concept_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B	zz = new B();                       // obj = new B();
		zz.print  ();                      // obj.print  ();
		zz.display();  // inheritance                    //obj.display();
        zz.m(4, 3);     //over ridding            
	    zz.m(1, 2, 3);  // over loading
	    zz.abc();       //abstract
	
	}

}
                       


abstract  class A {
void print()
{
System.out.println("parent class"); 
}
void m(int a,int b)
{
	int c=a+b;
	System.out.println(c);
}
 
abstract void  abc();
}

class B extends A 
{
void display() 
{
System.out.println("child class");
}

void m(int a,int b,int c)
{
	int d=a+b+c;
	System.out.println(d);
}
void m(int a,int b)
{
	int c=a*b;
	System.out.println(c);
}
void abc()
{
	System.out.println("abstract mtd");
}

	}


