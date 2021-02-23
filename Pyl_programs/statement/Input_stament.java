package statement;

import java.util.Scanner;

public class Input_stament {
	
	int add()
	{
		Scanner sc=new Scanner(System.in);
		
	System.out.println("enter a value");
	
	int a=sc.nextInt();
	 
	System.out.println("enter b value");
	
	int b=sc.nextInt();
	
	int c=a+b;
	
	System.out.println(c);
	return c;

	}
	public static void main(String[] args)
	{
		Input_stament obj=new  Input_stament();
		obj.add();

	}

}
