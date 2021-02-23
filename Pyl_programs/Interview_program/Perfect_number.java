package Interview_program;

public class Perfect_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int num=6;
  int sum=0;
  
  for(int i=1;i<num;i++)
  {  
	  if(num%i==0)
	     {  
		  sum=sum+i;
		  System.out.println(sum);
	      }
  
  }
	  if (num==sum)
	  
		  {
		  System.out.println(  "perfect number");
		  }
	  
		  else 
			  
		 {
			  System.out.println( "Not a perfect number"); 
		  }
	  
	  
  
  }
	  
  
  
  
  
	  
	  
	  
	  
	}
	
	


