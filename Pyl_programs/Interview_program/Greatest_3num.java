package Interview_program;

public class Greatest_3num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		d obj=new d();
        obj.greatestnum(10, 2, 3);
		}}
 class d
{
void  greatestnum (int a,int b,int c)
{
	int x = (a>b?a:b);
	
	int y = (x>c?x:c);
	System.out.println( y );
}

}   






