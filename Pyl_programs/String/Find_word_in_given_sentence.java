package String;

public class Find_word_in_given_sentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String s="one of the best of the best";
  // find "the" word in given sentence
  char c[]=new char [s.length()];
  for (int i=0;i<=s.length();i++)
  {
	  c[i]=s.charAt(i);
	  
  }
 int count =0;
 for (int i=0;i<c.length;i++)
 {
	 if(c[i]=='t'&& (i+1<c.length) && c[i+1]=='h' &&  (i+2<c.length) && c[i+2] == 'e')
	 {
		 count = count +i;
		 
	 }
	
 }
  System.out.println(count);
	}

}
