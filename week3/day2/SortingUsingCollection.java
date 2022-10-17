package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arr[]= {"HCL", "Wipro",  "Aspire Systems", "CTS"};
		int c=arr.length;
		System.out.println("Length is " +c);		
		Arrays.sort(arr);
		System.out.println("Forward order");
		for(String i:arr)
		{
		System.out.println(i);
		}
		Arrays.sort(arr,Collections.reverseOrder());
		System.out.println("Reverse order");
		for(String i:arr)
		{
		System.out.println(i);
		}
		

	}

}
