package Encapsulation;

public class Get_As_Set_As_method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bank j = new bank();
		
		System.out.println(j.getAccountnumber());
		j.setAccountnumber(5);
		System.out.println(j.getAccountnumber());
	}
}

class bank {
	private int accountnumber;

	public int getAccountnumber() {
		System.out.println(accountnumber);
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

}
