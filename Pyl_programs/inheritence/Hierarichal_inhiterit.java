package inheritence;

public class Hierarichal_inhiterit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
two obj=new two();
  obj.display();
  obj.print();
  
  three ob=new three();
  ob.display();
  ob.screen();
  
	}

}
class one
{
	void display()
	{
		System.out.println("im x parant class");
	}
}

class two extends one
{
	void print()
	{
		System.out.println("im y child  class");
	}
}

class three extends one
{
	void screen()
	{
	System.out.println("im y child class");	
	}
}