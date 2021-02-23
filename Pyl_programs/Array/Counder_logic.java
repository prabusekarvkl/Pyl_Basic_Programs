package Array;

public class Counder_logic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int y[]={1,2,3,4,5,4,6,7,4};
int count =0;
for (int i=0;i<y.length;i++)
{
	if(y[i]==7)
	{
		count=count+1;
		
	}
}
System.out.println("7 is present"+" "+ count+"  "+"times");

	}

}
