package Interview_program;

public class Fizz_Buzz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i % 5 == 0) // or (i%15==0)
			{
				System.out.println(i + " " + "fizz & buzz");
			}
			

			{
				if (i % 3 == 0)
					System.out.println(i + " " + "fizz");
			}

			if (i % 5 == 0) {
				System.out.println(i + " " + "buzz");
			}

		}
	}

}
