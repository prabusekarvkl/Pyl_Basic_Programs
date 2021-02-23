package Practice_1;

public class Prime_3rd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int num =15;
 int k=0;
 for (int i=2;i<15;i++)
 {  if(num%i==0)
	 k++;
 } 
 if(k==2)
 {
	System.out.println("prime"); 
 }
 else
 {
	 System.out.println( "not prime"); 
 }
	}

}
