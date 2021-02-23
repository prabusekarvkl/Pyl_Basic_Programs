package String;

public class String_vowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String s="malala got noble prize for peace";
       
       char c[]=new char [s.length()];
          // string to array
       
       for (int i=0;i<s.length();i++)
       {
    	  c[i]=s.charAt(i);
    	 
       }
	
       for (int i=0;i<c.length;i++)
       {
    	
		if (c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')   
    	{
			System.out.print(c[i]+" ");
    	}
		
       }
	} }


