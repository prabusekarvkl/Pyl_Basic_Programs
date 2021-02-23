package Array;

public class AUBUC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 9, 3, 6, 4, 7, 2, 1 }; // size=7
		int b[] = { 14, 3, 2, 6, 9, 7 }; //size =6
		int c[] = {24,23,12,13,7,6,7,2};     // size=8
		int d[] = new int[a.length + b.length+c.length];
		
		
		
	//merging
		
		
		
		for (int i = 0; i < a.length; i++) 
	{     
			d[i] = a[i];

	}
		int k = 0;
		for (int j = a.length; j < a.length+b.length; j++)  
	{
			d[j] = b[k];
			k = k + 1;

	}
           int m=0;
		for (int l = a.length+b.length; l < d.length; l++)
	{
		    d[l]=c[m];	
		      m=m+1;

	}
		//merging print statement
		for (int i =0;i < d.length; i++)
		{
			  /// System.out.print(d[i]+" ");
		}
		
		 
		//duplicate checking
		for (int i =0;i < d.length; i++)
			
		{
			for (int j =i+1;j < d.length; j++)	
			{
				if(d[i]==d[j])
				{
					d[j]=0;
				}
				if (d[i] > d[j])

				{   //  sorting  swap logic
					//int temp;    
					//temp = d[i];     
				//	d[i] = d[j];     
				//	d[j] = temp;
					
					
					d[i] = d[i] + d[j];
					d[j] = d[i] - d[j];
					d[i] = d[i] - d[j];

				}
				
		}
			
		
	}         //removing the finding duplicates
		for (int h =0;h < d.length; h++)
		{
			if(d[h]!=0)
			{
				System.out.print(d[h]+" ");
			}
		}

}
	}
