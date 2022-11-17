package week3.day1;

public class Audi extends Car{

	  int a=55;
	public void hybridFuel() {
		// TODO Auto-generated method stub
		System.out.println("Hybrid Fuel-Audi");

	}
	public void applyBrake()
	{
		System.out.println("applyBrake-Audi");
	}
	public void brake()
	{
		this.applyBrake();
		super.applyBrake();
		System.out.println("Print current class a " +this.a);
		System.out.println("Print parent class a " +super.a);
	}
}
