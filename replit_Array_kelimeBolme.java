package Replit;

import java.util.Arrays;

public class replit_Array_kelimeBolme {

	public static void main(String[] args) {
		/*Create a custom return type method accepts a name as parameter and prints the name as a char array.
				(do not use toCharArray() method)
				Input : John
				Output :[J, o, h, n]
*/
	
	String isim ="John";

	String arr[]=isim.split("");
	
	System.out.println(Arrays.toString(arr));
	
	

	}

}
