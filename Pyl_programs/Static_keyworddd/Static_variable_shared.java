 package Static_keyworddd;

public class Static_variable_shared {
	
public static void main(String[] args) {
		// TODO Auto-generated method stub
test t1=new test();
{
	System.out.println(t1.b);
	
System.out.println(test.a);
     t1.b=50;
	System.out.println(t1.b);
}

test t2=new test();
{
	System.out.println(t2.b);
	t2.b=25;
System.out.println(t2.b);	
 
System.out.println(test.a);
}
		
		
	}

}
class test
{
static int  a=100000;
  int b=200;
}