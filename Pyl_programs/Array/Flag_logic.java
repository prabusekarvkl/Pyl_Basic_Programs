package Array;

public class Flag_logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int x[]={1,2,3,4,5,6,7,8,9};
boolean flag=false;
for (int i=0;i<x.length;i++)
{
	if (x[i]==8)
	{
		flag = true;
	}
	
}
if (flag==true)
{
	System.out.println("element found");
}
else
{
	System.out.println("element not found");
}

	}

}
