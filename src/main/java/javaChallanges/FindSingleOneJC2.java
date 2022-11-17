package javaChallanges;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class FindSingleOneJC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=sc.nextInt();
		int array[]=new int[n];// [2,2,1] [4,1,2,1,2] [1]
		Set<Integer> set=new TreeSet<Integer>();
		System.out.println("Enter the numbers: ");
		for(int i=0;i<n;i++)
		{
			array[i]=sc.nextInt();
		}
		System.out.println("Array is: ");
        for(int i:array)
        {
        	System.out.println(i);
        }
        for (int i = 0; i < n; i++) {
            int count = 0;
       
            for (int j = 0; j < n; j++) {
              if (array[i] == array[j]) {
                count++;
              }
            }
            if (count == 1) {
              System.out.println("Single number is: " +array[i]);
            }
          }
       
       
}
}
