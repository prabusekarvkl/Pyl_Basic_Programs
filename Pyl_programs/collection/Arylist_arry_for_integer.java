package collection;

import java.util.ArrayList;

public class Arylist_arry_for_integer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Integer> al = new Arraylist <Integer>();
		al.add(1);
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		int a[]={al.size()};
		for(int i=0;i<a.length;i++)
		{
			a[i]=al.get(i);
			System.out.println(a[i]);
		}
	}

}
