package Static_keyworddd;

public class Basic_static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		{	 A obt=new A();
             
              obt.display();
        }
		                       // obt.x();
		{
		System.out.println(A.a);	
		}
		
		
	}

}


class A 
{
	static int a=1;
   int x=2;

 
  static void print()

{System.out.println(  a   ); }
  


void display() 

{System.out.println(" class 2 ");}


}

