package Practice_1;

public class Fizz_buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=100;i++)
		{
			if(i%3==0  &&  i%5==0)  //or (i%15==0)
            {
              System.out.println("fizz & buzz");
             }
			 if(i%3==0)
			 {
     	        System.out.println("fizz");
	                }
			 if (i%5==0)
			 {
				 System.out.println("buzz");
				 
			 }
				 else
				 {
					 System.out.println(i);
				 }
				 
			 
		}

	}

}
