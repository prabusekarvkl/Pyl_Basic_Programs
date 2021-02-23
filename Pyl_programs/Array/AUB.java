 package Array;

public class AUB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 9, 3, 6, 4, 7, 2, 1 }; // size=7
		int b[] = { 14, 3, 2, 6, 9, 11, 7 };
		int c[] = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) 
	{     
			c[i] = a[i];

		}  //merging
		int k = 0;
		for (int j = a.length; j < c.length; j++)  
		{
			c[j] = b[k];
			k = k + 1;

		}

		for (int i = 0; i < c.length; i++)
		{
			// System.out.println(c[i]);

		}
		// find and remove duplicate  

		for (int i = 0; i < c.length; i++)

		{
			for (int j = i + 1; j < c.length; j++) // linear compare algorithm

				if (c[i] == c[j])
				{
					c[j] = 0; // or a[i]

				}

		}

		for (int i = 0; i < c.length; i++) // printing array
		{

			if (c[i] != 0)
			{
				System.out.print(c[i] + " ");

			}

		}

	}

}
