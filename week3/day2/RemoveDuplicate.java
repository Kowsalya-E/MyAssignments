package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {
	public static void main(String args[])
	{
		String s="PayPal India";
		char arr[]=s.toCharArray();
		System.out.print("Print Character Array is:");
		for(char i:arr)
		{
			System.out.print(i);
		}
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new TreeSet<Character>();
		for(char i:arr)
		{
			charSet.add(i);
			
		}
		System.out.println();
		System.out.print("Print charSet:");
		
		for(char i:charSet)
		{
			if(i!=' ')
			{
			charSet.add(i);
			System.out.print(i);	
			
		}
		}
		System.out.println();		
		int z=arr.length;//12
		System.out.print("Print dupCharSet:");
	     for(char i:arr)
			
		{ 
			for(int j=0;j<z-1;j++)
			{
				for(int j1=j+1;j1<z-1;j1++)
				{
					
					if(arr[j]==arr[j1])
				{
					dupCharSet.add(arr[j1]);
					//System.out.print(arr[j1]);
					break;
				
				}
				}
				
			}
			
		}
	 	
			for(char i:dupCharSet)
			{
				if(i!=' ')
				{
				
				System.out.print(i);	
				
			}	
		
	}

}
}
