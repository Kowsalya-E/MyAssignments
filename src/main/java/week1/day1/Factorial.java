package week1.day1;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1;
		System.out.println("Enter input");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		System.out.println("factorial of "+n +" is " +fact);

	}

}
