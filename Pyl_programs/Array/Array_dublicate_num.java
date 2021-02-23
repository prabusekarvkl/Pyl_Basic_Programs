package Array;

public class Array_dublicate_num {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 5, 2, 4, 4, 5, 6, 5 };
		for (int i = 0; i < a.length; i++)

		{
			for (int j = i + 1; j < a.length; j++) // linear compare algorithm

				if (a[i] == a[j]) {
					a[j] = 0; // or a[i]

				}

		}
		
		for (int i = 0; i < a.length; i++) // printing array
		{

			if (a[i] != 0) {
				System.out.print(a[i] + " ");

			}

		}

	}

}
