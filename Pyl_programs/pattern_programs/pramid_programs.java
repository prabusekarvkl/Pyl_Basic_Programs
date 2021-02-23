package pattern_programs;

public class pramid_programs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		{
			for(int i=1;i<=5;i++)
			{
				 System.out.println("i"+i);
				 for(int j=1;j<=5-i;j++)	
				{
					System.out.print("j");
				}
				 for(int k=1;k<=i;k++)
				 {
				 System.out.print("* ");
				 }
			}
		}
	}

}
