package Array;

public class Merging_3_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]={1,2,3,4,5} ;	
		int y[]={11,12,13,14,15} ;	
		int z[]={21,22,23,24,25} ;	
		
		int a[]=new int [x.length+y.length+z.length];
		
		
		for (int i=0;i<x.length;i++)
		{
			a[i]=x[i];
			
		}
		int d=0;
		for (int j=x.length;j<x.length+y.length;j++)
		{
			a[j]=y[d]; 
			d=d+1;
		}
		int e=0;
		for (int k=x.length+y.length;k<a.length;k++)
		{
			a[k]=z[e];  
			e=e+1;
		}
		for (int i=0;i<a.length;i++)
		{
		System.out.print(a[i]+ " ");
		}
		
		
	}

}
