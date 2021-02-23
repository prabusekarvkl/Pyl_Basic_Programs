package Practice_1;

public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
bb obj=new bb();
obj.zz();
obj.zz(1,2);

	}

}

class bb
{
	void zz()
	{
		System.out.println("zz");
	}
	
	void zz (int a, int b) 
	{
		//a=1;
		//b=2;
		System.out.println(a+b);
	}
	
	
	
	
}