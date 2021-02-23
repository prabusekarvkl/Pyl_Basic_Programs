package Interview_program;

public class Armsstrong_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153;
		if (num>0)
		{
			int a= num /100;
			int y= num%100;
			int b= y/10;
			int c=  y%10;

			System.out.println(a+ " "+b+" "+c);
		}  
	}

}
   