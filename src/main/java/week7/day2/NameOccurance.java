package week7.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import com.google.gson.internal.LinkedTreeMap;

public class NameOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Pradeep Kumar";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char arr[]=s.toCharArray();
		for(char c:arr)
		{
			if(map.containsKey(c))
					{
				      map.put(c,map.get(c)+1);
					}
			else
			{
				map.put(c,1);
			}
		}
		System.out.println("Map is " +map);
	

	}

}
