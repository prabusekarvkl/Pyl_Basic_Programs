package Array;

public class Sub_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1,10,20,30,40,50};
int b[]={30,40,50,20};
int count =0;
for (int i=0;i<=b.length-1;i++)
{
	for (int j=0;j<=a.length-1;j++)
	{
		if(b[i]==a[j])
		{
			count=count+1;
			//System.out.println(count);
		}
	}
	
}
if(count==b.length)
{
	System.out.println("b is sub array of a");
}
else
{
	System.out.println("b is Not sub array of a");
}
}

}
