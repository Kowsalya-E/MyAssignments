package week1.day2;

import java.util.Scanner;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt()				;
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
		{
			arr[i]=sc.nextInt(); //3,2,11,4,6,7
		}
		for(int j=0;j<size;j++)
		{
			for(int k=1;k<size;k++)
			{
			 if(arr[j]>arr[k])
			 {
				 arr[k]=arr[j];
			 }
			}
		}
       
	}

}
