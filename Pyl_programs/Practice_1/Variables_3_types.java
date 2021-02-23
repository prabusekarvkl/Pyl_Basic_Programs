package Practice_1;

public class Variables_3_types {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
pp obj= new pp();
  obj.add();
  {
	  System.out.println(pp.b);
	pp.sub();   //static method
	 
	  
  }
	}

}
class pp
{
      int a=1;
static int b=2;

void add()
{
	int a=11;
	//int b=22;
	System.out.println( a+b);
	System.out.println(a+b+this.a);// (11+22+1)
}

 static void  sub()
{
	 int c;
	 c=b+b;
	System.out.println(c);
}

	
	
	
	
	
	
	
	
	
	
}