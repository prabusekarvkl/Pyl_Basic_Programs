package Array;

public class Find_min_element_array
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		int a[] = { 2, 5, 7, 47, 97, 1, 6, 87, 33 };
		int min = a[0];
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] < min)
			{
				min = a[i];
				
			}

		}
		System.out.print(min);

	}
}
