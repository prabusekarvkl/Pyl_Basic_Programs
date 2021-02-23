package String;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String s= " chandru is a very good boy";
		String x[]=s.split(" ");
		for (int k=x.length-1;k>=0;k--)
		{
			String b=x[k];
			for (int j=b.length()-1;j>=0;j--)
			{
				System.out.print(b.charAt(j));
			}
			System.out.print(" ");
			}   
	}

}
