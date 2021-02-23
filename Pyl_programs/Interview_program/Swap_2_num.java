package Interview_program;

public class Swap_2_num {

	public static void main(String[] args) {
		
 ma maobj=new ma();
 maobj.swap();
maobj.greatestnum(40, 20);
 maobj.greatestnum(30, 40,  50);
	}
  
}
 class ma 
 {
	 void swap()
	 {
		 int a=100;
		 int b=2;
		 System.out.println("before swap  "+a +"     "+ b);  
		 
		// a=a+b;
		// b=a-b;
		// a=a-b;
		             //  int c;
		           //  c=a;
		          //     a=b;
		         //       b=c;
		               
		               
		               
		 //formula type
		   a=a+b;
		  b=a-b;
		  a=a-b;
		 
		 System.out.println("after swap   "+a +"     "+  b);
	 }
	 void greatestnum (int a,int b)
	 {
		 int c =(a>b ?a:b);
		 System.out.println(c); 
	 }
	void  greatestnum (int a,int b,int c)
	{
		int x = (a<b?a:b);
		int y = (x>c?x:c);
		System.out.println( y );
	}
	
 }
 