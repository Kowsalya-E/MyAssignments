package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateWords {

	 public static void main(String args[])
	 {
		 String text = "We learn java basics as part of java sessions in java week1";
		 String arr[]=text.split(" ");
		 for(int i=0;i<arr.length;i++) 
		 {
			 
			 System.out.print(arr[i]+" "); 
		 }
		 Set<String> set=new LinkedHashSet<String>();
		 for(String s:arr)
		 {
			 set.add(s);
		 }
		 System.out.println();
		 System.out.println("Expected outcome is " +set);
	 }
}
