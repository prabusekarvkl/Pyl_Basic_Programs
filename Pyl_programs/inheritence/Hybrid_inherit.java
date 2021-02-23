package inheritence;

public class Hybrid_inherit {
static // static block   
{
	System.out.println("jyg");
}

	public static void main(String[] chandru) {
		// TODO Auto-generated method stub
demo4 jct=new demo4();    
      jct.tea();          
      jct.coffee();       
     jct.horlicks();     
     jct.boost(); 
		
/* demo6 chan=new demo6();
		chan.tea();
		chan.coffee();
		chan.horlicks();
		chan.boost();
        chan.chocolate();
       // chan.complan();    */      
        
 demo5 ct=new demo5();
      ct.tea();
      ct.complan();
       
 demo6 t =new demo6();
       t.tea();
       t.chocolate();
      
	}

}
class demo1
{
void tea() 
{
System.out.println("im demo1 tea class");

}
}


class demo2 extends demo1
{
void coffee() 
{
System.out.println("im demo2 coffee class"); 
}
}


class demo3 extends demo2
{
	void horlicks()
	{
		System.out.println("im demo3 horlicks class");
	}
}

class demo4 extends demo3
{
	void boost()
	{
	System.out.println("im demo4 boost class");	

	}
} 

class demo5 extends demo4
{
	void complan()
	{
		System.out.println("im 1st sub complan class");
		
	}
}

class demo6 extends demo4
{
	void chocolate()
	{
	System.out.println("im 2nd sub chocolate clas");	
	}
}