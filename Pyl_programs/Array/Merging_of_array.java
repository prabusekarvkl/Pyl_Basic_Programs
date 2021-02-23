package Array;

public class Merging_of_array {

	public static void main(String[] args)         
 {   
		// TODO Auto-generated method stub
int a[]={1,2,3,4,5};
int b[]={6,7,8,9,10};
int c[]=new int [a.length+b.length];    
for (int i=0;i<a.length;i++)
{
	c[i]=a[i];             
} 
int k=0;
for (int j=a.length;j<c.length;j++)              
{
	c[j]=b[k];
   	k=k+1;
}
for (int i=0;i<c.length;i++)  
{
System.out.println(c[i]);
}
	
		
		
		
			
	}

}
