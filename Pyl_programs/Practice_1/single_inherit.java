package Practice_1;

public class single_inherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 uu obj=new uu();
   obj.boy();
   obj.girl();
	}

}
class rr
{
	void boy()
	{
		System.out.println(" boy");
	}
	
}

class uu  extends rr
{
	void girl()
	{
		System.out.println("girl");
	}
}