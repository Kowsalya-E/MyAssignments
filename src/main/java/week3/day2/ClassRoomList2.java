package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class ClassRoomList2 {
	public static void main(String args[])
	{
		String arr[]= {"Arun","Deepa","Maria","Deepa","Sharmila","Muthu","Chinarasu"};
	List<String> list=new ArrayList();  
	for(int i=0;i<arr.length;i++)
	{
		list.add(arr[i]);
		
	}
	/*list.add("Arun");
	list.add("Deepa");
	list.add("Maria");
	list.add("Deepa");
	list.add("Sharmila");
	list.add("Muthu");
	list.add("Chinrasu");*/
	System.out.println("List is " +list);
	for(String i:list)
	{
		if(i.startsWith("M"))
		{
			System.out.println(i +" is starts with M");
		}
	}
	}
}
