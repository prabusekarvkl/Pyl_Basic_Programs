package Static_keyworddd;

public class Static_all_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
prabu obj=new prabu();
obj.add();

{
	System.out.println(prabu.y);
	System.out.println(prabu.z);
	System.out.println(prabu.a);
}

		
		
	}

}


class prabu
{ 
	
	int add()
	{
		int x=1;
		{
			System.out.println(x);
		}
		return x;
	}
	
	
	static int y=2;
	final static int z=3;
	final static int a=11;
	final int  b=12;
	int   c=13;
	
}