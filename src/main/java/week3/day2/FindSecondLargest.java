package week3.day2;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindSecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> set=new HashSet<Integer>();
		for(int i:data)
		{
			set.add(i);
		}
		List<Integer> list=new ArrayList<Integer>(set);
		Collections.reverse(list);
		System.out.println(list);
			System.out.println("Second Largest is:" +list.get(1));
		
		
	}

}
