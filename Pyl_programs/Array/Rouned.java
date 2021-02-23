package Array;

public class Rouned {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a =506;
int b=a%10;
int c=0;
int d=0;
if (b<6)
{
	c=a-b;
	System.out.println(c);
}
else 
{
	if(b>=6)
	{
		d=10-b;
		
		c=a+d;
	System.out.println(c);
	}
		
}
	}

}
