package String;

public class String_string_array {

	public static void main(String[] args) 
	{
		String s= " chandru is a very good boy";
		String x[]=s.split(" ");
		//int count=0;
		 /*  for (int i=0;i<x.length;i++)
		{
			System.out.print(x[i]+" ");
		} 
		    */
			for (int j=x.length-1;j>=0;j--)
		{
			System.out.print(x[j]);
			System.out.println(" ");
		}      
	 //System.out.println(" ");
		for(int i=0;i<x.length;i++)
		{ 
			String a=x[i];
			for (int j=a.length()-1;j>=0;j--)
			{   
				System.out.print(a.charAt(j));
			}
		System.out.print(" ");
	
	}
		for(int i=x.length;i>=0;i--)
		{ 
			String a=x[i];
			for (int j=a.length()-1;j>=0;j--)
			{   
				System.out.print(a.charAt(j));
			}
		System.out.print(" ");
	
	}
	// how many time "is" in the given sentence
	   
		
	}}
