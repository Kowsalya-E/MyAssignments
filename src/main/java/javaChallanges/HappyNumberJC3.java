package javaChallanges;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class HappyNumberJC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int n, r = 1, num, sum = 0;
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number=");
	        n = sc.nextInt();
	        num = n;
	        while (num >9)
	        {
	            while (num > 0)
	            {
	                r = num % 10;
	                sum = sum + (r * r);
	                num = num / 10;
	            }
	            num = sum;
	            System.out.println("Number" +num);
	            sum = 0;
	        }
	        if (num == 1)
	        {
	            System.out.println("Happy Number");
	        }
	        else
	        {
	            System.out.println("Not Happy Number");
	        }
	}
}
