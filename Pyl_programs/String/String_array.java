package String;
public class String_array {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[] = {"erode","gobi","chennai","covai"};
		// char c[]=new char [s.length];
		
		 //find a word string array
		for (int i = 0; i < s.length; i++) {
			if (s[i] == "gobi"){
				System.out.println(s[i].length());  }}
			// reverse a string array
		for (int j = s.length-1;j>=0; j--) {
			{
				System.out.println(s[j]);
			}}
		
		//reverse a string
	
		for (int k = s.length-1;k>=0; k--) 
		{  String z = s[k];
		
		for (int k1 = s.length-1;k1>=0; k1--) 
			{ 
				System.out.print(z.charAt(k1)+" ");
			}
		}
		
		//reverse of string array
		for (int i =0;i<= s.length; i++) {
			String x = s[i];
			
			for (int j =0;j<= s.length; j++) {
				System.out.println(x.charAt(j));}
			System.out.println(" ");
		}
		
	}

}
