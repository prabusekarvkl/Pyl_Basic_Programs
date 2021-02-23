package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs = new HashSet<String>();
		hs.add("sam");
		hs.add("raj");
		hs.add("sam");
		hs.add("kumar");
		System.out.println(hs);
		
		LinkedHashSet<String> ls = new LinkedHashSet<String>();
		                 
		                ls.add("sam");
		          		ls.add("raj");
		          		ls.add("sam");
		          		ls.add("kumar");
		          		System.out.println(ls);
		          		
		          		TreeSet<String> ts = new TreeSet<String>();
		                 
		                ts.add("sam");
		          		ts.add("raj");
		          		ts.add("sam");
		          		ts.add("kumar");
		          		System.out.println(ts);
		          		
		          		
		          		
		          		
	}
	}


