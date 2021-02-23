package interview_programss;

public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mark = 76;
		int n = 1;
		switch (n) {
		case 3:
			if (mark >= 76 && mark < 90)
				System.out.println("pass with 2nd class");
		case 4:
			if (mark >= 91 && mark <= 100)
				System.out.println("pass with 1st class");
		case 1:
			if (mark >= 0 && mark < 49)
				System.out.println("fail");
		case 2:
			if (mark >= 50 && mark < 75)
				System.out.println("pass with 3rd class");
		default:
			System.out.println("invalid mark");
		}
	}

}
