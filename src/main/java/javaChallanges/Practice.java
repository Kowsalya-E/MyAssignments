package javaChallanges;

import org.apache.poi.util.SystemOutLogger;

public class Practice {   
  	 public static void main(String args[]) {
		// Write your code here		
      
      String str1="MADAM";
      String rev="";
      for(int i=str1.length()-1;i>=0;i--)
      {
        rev=rev+str1.charAt(i);
      }
    System.out.println("reversed string is" +rev +rev.length());
    
    System.out.println(" string is " +str1);
      if(rev.equals(str1))
         {
           System.out.println("It's a plaindrome");
         }
         else
         {
            System.out.println("It's not a plaindrome");
         }
      
		
		
	}
}

