package Array;

public class Find_max_element_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a[]={2,5,7,47,97,1,6,87,33};
int max=a[0];
for (int i=0;i<a.length;i++)
{
	 if( a[i]>max)
	 {
		max=a[i];
		
	 }
	 
}
System.out.print(max);

	}
	
}
