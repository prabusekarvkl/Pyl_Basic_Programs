package statement;

import java.util.Scanner;

public class Array_statement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a[]= new int [51];
for (int i=0;i<=a.length;i++)
{
	System.out.println("enter value for array pf index"+ i);
	a[i]= sc.nextInt();
}
	}

}
