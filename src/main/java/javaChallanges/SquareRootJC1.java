package javaChallanges;

import java.util.Scanner;

public class SquareRootJC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();//25
		double temp;
		double sqrt=num/2;
		//int s=(int) Math.sqrt(898);
		//System.out.println(s);
		do   
		{  
		temp=sqrt;  
		sqrt=(temp+(num/temp))/2;  
		}   
		while((temp-sqrt)!= 0);  
		System.out.println("Sqaure toot of the entered number is: " +(int)sqrt);
	}
}
