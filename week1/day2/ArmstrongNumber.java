package week1.day2;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	       Scanner sc=new Scanner(System.in);
	       System.out.println("Enter the checking number");
	       int n=sc.nextInt();
	       int n1=n;
	       int t=0;
	       while(n>0)
	       {
	    	   int x=n%10;
	    	   t+=(x*x*x);
	    	   n=n/10;
	       }
	       if(t==n1)
	       {
	       System.out.println("the number "+n1+" is an armstrong number" );
	       }
	       else
	       {
	      System.out.println("the number "+n1+" is not an armstrong number" );
	       }
	}
	       

}
