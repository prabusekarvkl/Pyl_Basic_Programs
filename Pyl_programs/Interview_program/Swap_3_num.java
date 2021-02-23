package Interview_program;



public class Swap_3_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	aaa aa=new aaa();
		   aa.swap();
}}
class aaa
		{
			 void swap()
			 {
				 int a=35;
				 int b=2;
				 int c=165;
				 int d=1;
				 System.out.println("before swap  "+a +"     "+ b + "     "+ c );
				 
	
	             //	 a=c-a;      //3-1=2, here a=2
		        //	 b=a+x;    //2+1=3,   here b=3
		      //	 c=b-a;   //3-2=1,    here c=1
//	int d =a;
//	a=b;
//	b=c;
//	c=d;
	
	//formula type
	a=a+b+c;
    c=a-(b+c);
	b=a-(b+c);
    a=a-(b+c);
	 System.out.println("after swap   "+a +"     "+  b + "     " + c );
		      }
		}
	


