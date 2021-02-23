package Practice_1;

public class Final_keyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		c1 obj= new c1();
		  obj.add();
		  c1.sub();
	}

}

class c1
{
   final   int a=1;
 final static int b=2;

 final void add()
{
	 final int a=10;
	int b=22;
	System.out.println( a+b);
	System.out.println(a+b+this.a);
}

 static void  sub()
{
	 int c;
	 c=b+b;
	System.out.println(c);
}
}
