package abstraction;

public class Abstract_basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
max obj=new max();
   obj.normal(5, 8);
   obj.add();
   obj.mul();
   obj.sub();
	}

}
class ab
{
	void normal(int a, int b)
	 {  int c;
		
		c=b-a;
		System.out.println(c);
	}
}
abstract class prabu extends  ab
{
	abstract void add();
}


abstract class kannan  extends prabu
{
	abstract void sub();
}


abstract  class chandru   extends kannan
{
	abstract void mul();
	}


  class max    extends chandru
{
	  void add()
	{
		System.out.println("add");
	}
	
	void sub()
	{
		System.out.println("sub");
	}
	
	void mul()
	{
		System.out.println("mul");
	}
}







