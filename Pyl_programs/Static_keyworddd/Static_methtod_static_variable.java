package Static_keyworddd;

public class Static_methtod_static_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println*/ demo.add();
		demo obj=new demo();
	 	obj.m();
		
			
		
		
		
	}

}

class demo
{
	
int a=1;
static int b=2;


static /*int*/ void add ()
{
	System.out.println(b);
	//return b;
}

void m()
{
	int a=10;

	System.out.println((a+b+this.a));
	                 //(10+2+1) take  local value & instance value
	System.out.println(b+a);
	                //(2+10)
}
}