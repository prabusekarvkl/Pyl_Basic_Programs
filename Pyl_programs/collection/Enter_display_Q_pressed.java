package collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Enter_display_Q_pressed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> al = new Arraylist <Integer>();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		String s= sc.next();
		while (!s.equals("q"))
		{
			Integer i = Integer.parseInt(s);
			al.add(i);
			System.out.println("enter the number");
			s=sc.next();
		                                      	//System.out.println(al);
		}
		
		for (int i=0;i<al.size();i++)
		{
			System.out.println(i);
		}
	}

}
