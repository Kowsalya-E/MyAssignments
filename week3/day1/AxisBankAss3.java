package week3.day1;

public class AxisBankAss3 extends BankInfoAss3{
	public void deposit()
	{
		System.out.println("Deposit is");
		super.deposit();
	}
	public static void main(String arguments[])
	{
		AxisBankAss3 a=new AxisBankAss3();
		a.deposit();
		a.fixed();
		BankInfoAss3.saving();
		
		
		
		
	}
	
}
