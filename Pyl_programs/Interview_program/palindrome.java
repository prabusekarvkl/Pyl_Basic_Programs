package Interview_program;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 boolean flag =true;
 String s ="mom";
 char a []= new char [s.length()];
 char b []= new char [s.length()];
 for (int i=0;i<s.length();i++)
 {
	 a[i]=s.charAt(i);
	 b[i]=s.charAt(i);
 }
 for (int i=0;i<s.length();i++)
 {
	if(a[i]!=b[a.length-1-i])
	{
		flag=false;
		
	}
 }
	if(flag== true)
	{
		System.out.println(" palindrome");
	}
	else
	{
		System.out.println(" Not a  palindrome ");
	}
 
	}

}
