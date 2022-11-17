package week3.day2;

import java.util.HashSet;
import java.util.Set;

public class PrintDuplicatesNumbers {
	public static void main(String args[])
	{
		int[] data = {4,3,6,8,29,1,2,4,7,8};
		Set<Integer> set=new HashSet<Integer>();
		System.out.println("Duplicate values are:");
		for(int i:data)
		{
			if(set.add(i)==false)
			{
				System.out.println(i);
			}
		}
	}

}
