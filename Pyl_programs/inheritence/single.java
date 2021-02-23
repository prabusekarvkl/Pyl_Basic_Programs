package inheritence;


public class single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		b1 obj=new b1 ();
		obj.tea();
		obj.coffee();

	}

}



class a1
{
void tea() 
{
System.out.println("im parent class");
}
}
class b1 extends a1
{
void coffee() 
{
System.out.println("im child class"); 
}
}