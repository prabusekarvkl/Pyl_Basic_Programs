package inheritence;

public class Multilevel_inherit {
//what is the parent object class
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    z obj=new z();
      obj.tea();
      obj.coffee();
      obj.horlicks();
 
	}

}

class x
{
void tea() 
{
System.out.println("im parent class");
}
}


class y extends x
{
void coffee() 
{
System.out.println("im intermediate class"); 
}
}


class z extends y
{
	 x oj=new x ();
	void horlicks()
	{
		System.out.println("im child class");
	}
}