package week3.day2;

public class MyAccount {
	public static void  main(String args[])
	{
		HDFC hdfc=new HDFC();
		hdfc.provideCreditCard(5897);
		
		RBI rbi=new HDFC();//-------interface wont create object
		rbi.minimumBalance(78907);
		rbi.provideDebitCard(222222);
	}

}
