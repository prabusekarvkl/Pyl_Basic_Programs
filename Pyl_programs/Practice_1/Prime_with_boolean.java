package Practice_1;

public class Prime_with_boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=100;
boolean flag =false;
for (int i=2;i<100;i++)
{
	if(num/i==0)
	{
		flag=true;
	System.out.println("not prime");	
	
	}
	else
	{    flag=true;
		System.out.println(" prime");
	}
}
	}

}
