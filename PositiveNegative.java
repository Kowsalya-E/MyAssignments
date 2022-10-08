package week1.day2;

import java.util.Scanner;

public class PositiveNegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the checking number");
       int n=sc.nextInt();
       if(n>0)
       {
    	   System.out.println("Entered number " +n+ " is positive number");
       }
       else if(n<0)
       {
    	   System.out.println("Entered number " +n+ " is negative number");
       }
       else
       {
    	   System.out.println("Entered number " +n+ " is neither positive nor negative");
       }
    		   
	}

}
