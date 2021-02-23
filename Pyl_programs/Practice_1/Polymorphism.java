package Practice_1;

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dd obj=new dd();
		obj.zz();
	
	}

}
class cc
{
	void zz()
	{
		System.out.println("parent class");
	}
}

 class dd     extends cc
 {
	void zz () 
	{
		//a=1;
		//b=2;
		System.out.println(" over ridding");
	}
	
	
	
	
}