package Qantler_programs;

public class bigest_3rd_num 
{

	public static void main(String[] args) 
	{
       
		int a[] = { 1, 3, 5, 2, 4, 4, 5, 6, 5 };
		int temp;
		for (int i = 0; i < a.length; i++)

		{
			for (int j = i + 1; j < a.length; j++) // linear compare algorithm

			{
				if (a[i] == a[j]) {
					a[j] = 0; 
				}
				if (a[i] < a[j])

				{
					// swap logic
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;

				}
				
			}

			
		}
		for(int i=0;i<a.length;i++)
		{
			
			System.out.println(a[i]);
		}
	}
	
	
}
