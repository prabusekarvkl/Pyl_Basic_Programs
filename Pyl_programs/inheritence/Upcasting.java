package inheritence;

public class Upcasting extends avm{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mood a= new Upcasting();
		a.add();

	}

}
 class mood
 {
 void add ()
 {
	 System.out.println("add");
 }
 }
 class avm extends mood
 {
 void sub ()
 {
	 System.out.println("sub");
 }
 }