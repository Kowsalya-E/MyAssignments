package week1.day2;

public class Mycar {

	public static void main(String argd[])
	{
		Car obj=new Car();
		float add1=obj.addition(5, 5.5F, 5);
		System.out.println(add1);
		float mul1=obj.multiplication(5.5F, 6);
		System.out.println(mul1);
		int div1=obj.division(6, 3);
		System.out.println(div1);
		
	}
}
