package collection;

import java.util.ArrayList;

public class Array_arylist_for_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s[] = { "ram", "prabu", "chandru", "kannan", "chezhi" };

		ArrayList<String> al = new ArrayList<String>();
		for (int i = 0; i < s.length; i++) {

			al.add(s[i]);
		}

		for (String ss : s)

		{

			System.out.println(ss);
		}
		
	}
	

}
