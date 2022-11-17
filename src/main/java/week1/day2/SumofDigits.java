package week1.day2;

import java.util.Scanner;

public class SumofDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the checking number");
	       int n=sc.nextInt();
	       int t1=n;
	       int t=0;
	       while(n>0)
	       {
	    	   int x=n%10;
	    	   t+=x;
	    	   n=n/10;
	       }
	       System.out.println("Number " +t1+ " sum is " +t);

	}

}
