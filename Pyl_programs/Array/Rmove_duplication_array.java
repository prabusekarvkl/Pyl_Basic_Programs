package Array;

public class Rmove_duplication_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 3, 5, 2, 4, 4, 5, 6, 5 };
		int temp;
		for (int i = 0; i < a.length; i++)

		{
			for (int j = i + 1; j < a.length; j++) // linear compare algorithm

				/*
				 * if (a[i] == a[j]) { a[j] = 0; // or a[i]
				 */
				if (a[i] > a[j])

				{
					// swap logic
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}

		}
		int count = 0;
		for (int i = 0; i < a.length; i++) // printing array
		{
			count = count + 1;
			if (a[i] != 0)
			{
				System.out.print(a[i]);
				if (count <= a.length - 1)
				{
					System.out.print(",");
				}
			}

		}

	}

}