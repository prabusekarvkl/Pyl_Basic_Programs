package Array;

public class Sum_of_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={1,2,3,4,5};
int sum=0;
for (int i=0;i<a.length;i++)
{
	
	sum=sum+a[i];
	

}
System.out.println(sum);       //sum
int avg=sum/a.length;                 //Average of sum  
System.out.println(avg);


	}

}
