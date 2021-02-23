package Interview_program;

public class dayqtr {

	public static void main(String[] args) {
			
	}

}
//opps
 class zzz
 {
	 void m(int a)
	 {
		 System.out.println("im super class");
	 }
 }
 class yyy
 {
	 void m(int a, int b)
	 {
		 System.out.println("im sub class");
	 }
 }
 
 class xxx extends ppp
 {
	 void m(int a)
	 {
		 System.out.println("over ride");

	 }
	 void i()
	 {
		 System.out.println("abst i mtd");
	 }
	 
	 void l()
	 {
		 System.out.println("abst l mtd");
	 }
	 void n()
	 {
		 System.out.println("abst n mtd");
	 }
 }
 abstract class ppp
 {
	 abstract void i();
	 abstract void  l();
	 abstract void   n();
 }