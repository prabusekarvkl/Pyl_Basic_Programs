package interview_programss;

public class Boolean_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = false;

		for (int i = 1; i <= 10; i++) {
			for (int j = 2; j <= 10; j++) {
				if (i == j) {
					flag = true;

				}
			}
		}
		System.out.println(flag);
		// sysout ctrl + space
	}

}
