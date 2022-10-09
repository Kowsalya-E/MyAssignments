package week1.day2;

import org.apache.poi.util.SystemOutLogger;

public class Car {
		 public void printCarName()
 {
	 System.out.println("My car name is ford");
 }
public int getRegNumber(int regNumber)
{
	return regNumber;
}
public String getColor(String colour)
{
	return colour;
}
public boolean isCarPuncture(boolean status)
{
	return status;
}
public float addition(int num1,float num2,int num3)
{
	
	float add=(num1+num2+num3);
	return add;
}

private int subtraction(int num1,int num3)
{
	
	int sub=num3-num1;
	return sub;
}
float multiplication(float num2,int num1)
{
	
	float mul=num1*num2;
	return mul;
}
int division(int num1,int num3)
{
	
	int div=num3/num1;
	return div;
}
public static void main (String args[])
{
	int n1=5;float n2=15.5F; int n3=15;	
	String carName="Ford";
	int regNumber=8888;
	String colour="Green";
	boolean status=false;
	Car obj=new Car();
	obj.printCarName();
	float add1=obj.addition(n1,n2,n3);
	int sub1=obj.subtraction(n1, n3);
	 float mul1=obj.multiplication(n2, n1);
	 int div1=obj.division(n1, n3);
	System.out.println(add1);
	System.out.println(sub1);
	System.out.println(mul1);
	System.out.println(div1);
	
}

}