package Interview_program;

public class odd_even_array_program 
{

	public static void main(String[] args) 
	
	{
		// TODO Auto-generated method stub
		int a[] = { 1,2,3,4,5,6,7,8,9,10 };

		int c[] = new int[a.length];
		int d[] = new int[a.length];

		for (int i = 0; i < a.length; i++)
		{
      		{
				if (a[i] % 2 != 0)
				{
					c[i] = a[i];
					System.out.print(c[i] + " ");
					

				}

			}
		
		}
		for (int j = 0; j < a.length; j++) 
		{
              {
				if (a[j] % 2 == 0) 
				{
					d[j] = a[j];
					System.out.print(d[j] + " ");

				}

			}

		}

	}
}
