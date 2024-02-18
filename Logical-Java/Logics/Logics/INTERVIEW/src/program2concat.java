

import java.util.Arrays;
import java.util.Collections;

public class program2concat {
	
	public static void main(String[] args) {
		String s1 = "ace";
	      String s2 = "bdf";
	      
	      //combined the inputs
	      String s3 = s1.concat(s2);
	      //System.out.println(s3);
	      //convert the String to charArray
	      char[] chars = s3.toCharArray();
	      
	      //sort the charArray
	      Arrays.sort(chars);
	      
	      //Make a String using sorted chars
	      String sorted = new String(chars);
	      System.out.println("Output is --> "+sorted);  
	      
		
		
		
	
	}

}
