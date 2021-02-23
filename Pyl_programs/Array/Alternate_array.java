package Array;

public class Alternate_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		int a[] = { 7, 5, 4, 2, 7, 9, 4, 11, 12, 8, 6 };
		for (int i = 0; i < a.length; i = i + 2) 
		{
			System.out.print(a[i] + " ");

		}
		for (int i = 0; i < a.length; i++) 
		{  if (i%2==0)

			count = count + 1;
		}
		System.out.println();
		System.out.println(count + " times even ");
		System.out.println();
		for (int i = a.length - 1; i > 0; i--)
		 {
			System.out.print(a[i] + " ");
		}
		{

		}

	}

}
