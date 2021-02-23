package collection;

import java.util.ArrayList;
import java.util.LinkedList;

//import testpackage4.Combine_ary_linklist.linkedList;

public class Combine_ary_linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> bl = new LinkedList<String>();
		bl.add("sam");
		bl.add("chan");
		System.out.print(bl);
		ArrayList<String> al = new ArrayList<String>();
		al.add("ui");
		al.add("vi");
		System.out.print(al);
		al.addAll(bl);
		System.out.println(al);
		/*
		 * System.out.println(al.get(2));
		 * System.out.println(al.contains("ram"));
		 * System.out.println(al.indexOf("prabu"));
		 * System.out.println(al.size()); System.out.println(al.size());
		 * al.clear(); System.out.println(al.size());
		 */
	}

}
