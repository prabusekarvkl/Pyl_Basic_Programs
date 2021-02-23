package String;

public class String_array_to_string {

	public static void main(String[] args) 
	{  //string to array
		String s[] = {"erode","gobi","chennai","covai"};
		for (int i = 0; i < s.length; i++) 
		{
			String x= s[i];
			for (int j = 0; j < s.length; j++) 
			{
				System.out.print(x.charAt(j)+" ");
				
			}
		} 
		System.out.print(" ");
	}

}
