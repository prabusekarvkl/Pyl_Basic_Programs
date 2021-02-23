package Array;

public class Array_intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 2, 3,2, 4, 5,6 };
		int b[] = { 6, 7, 8, 2, 10 };
		// int c[]=new int [a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) 
			{
				if (a[i] == b[j])
				{
					System.out.println(b[j]);
				}
			}

		}

	}

}
