package interview_programss;

public class Multipl_do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1;
		do {
			int n = 1;
			while (n <= 10) {
				System.out.println(i + "*"+n+"="+(n*i));
				n++;
			}
			i++;
		} while (i <= 10);
	}
}
