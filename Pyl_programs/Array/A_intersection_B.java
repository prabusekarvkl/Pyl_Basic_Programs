package Array;

public class A_intersection_B {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a[] = { 7,1,7,7,3};   // common (2,2,6)
		int b[] = { 3,1,7,7,4 };
		int c[]=new int [a.length+b.length];
		int k=0;
		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < b.length; j++) 
			{
				if (a[i] == b[j])
				{
					c[k] =  b[j];
					   k =  k + 1;
					   
				}
			}

		}
	
		
		
		for (int i = 0; i < c.length; i++)
		{
			for (int j = i+1; j < c.length; j++)
			{
				if(c[i]==c[j])
				{
					c[j]=0;
					
				}
			}
		}
		for(int i=0;i<c.length;i++)
		{
			if(c[i]!=0)
			
				System.out.print(c[i]+" ");
			
		}
		
		

	}

}
