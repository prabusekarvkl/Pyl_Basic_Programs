package Array;

public class Count_2elements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={5,3,6,3,2,3,3,1,5,4,3,2,1};
		int count5=0;
		int count3 =0;
		for (int i=0;i<a.length;i++)
		{
			if(a[i]==5)
			{
				count5=count5+1;
				
			}
			if(a[i]==3)
			{
				count3=count3+1;
				
			}
			
			
		}
		System.out.println("count5"+"  "+count5+ "times");
		System.out.println("count3"+" "+count3+ "times");
		

			}

	

}

