package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.apache.poi.util.SystemOutLogger;

public class MissingNumbers {

	 public static void main(String args[])
	 {
		int arr[]= {2,1,3,4,5,6,8,8,9,10};//7
		Set<Integer> set=new TreeSet<Integer>();
		for (Integer i:arr)
		{
			set.add(i);
		}
		int c=set.size();
		System.out.println("Size is " +c);
		Integer[] myArray = new Integer[c];
	      set.toArray(myArray);
	      Arrays.sort(myArray);
	      System.out.println("Sorted array is ");
	      for (int i:myArray)
	      {
	       System.out.print(i+" ");
	      }
	      int c1=myArray.length-1;
	    	 for(int i=0;i<c1;i++)
	        {
	            if(myArray[i]+1!=myArray[i+1])
	            {
	              System.out.println("Missing number is ");
	                System.out.println(myArray[i]+1);
	                break;
	            }
	        }
		
		
		
	 }
}

