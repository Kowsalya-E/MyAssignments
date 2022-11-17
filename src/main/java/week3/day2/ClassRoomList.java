package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassRoomList {
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
    /*list.add(23);
	list.add(54);
	list.add(67);
	list.add(55);
	list.add(66);
	list.add(42);
	list.add(27);
	list.add(89);*/
	
    int j=0;
	List<Integer> list=new ArrayList<Integer>();
	for(int i=0;i<=7;i++)
	{
		j=sc.nextInt();
		list.add(j);
	}
	System.out.println("List is " +list);
	for(int i:list)
	{
		if(i%2!=0)
		{
			
			System.out.println(i +" is odd number");
		}
	}
	}
}
