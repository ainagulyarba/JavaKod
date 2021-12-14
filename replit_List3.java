package Replit;

import java.util.Arrays;
import java.util.Scanner;

public class replit_List3 {

	public static void main(String[] args) {
		/*Get a sentence from the user. Accept the sentence received 
		 * from the user as a parameter, Invert sentence using Array and write 
		 * a Method that returns the result as a String to the main method.
		Note: Upper and lower case letters, spaces and special characters will not be changed.
		Input :
		It is very nice to write code.
		Output :
		.edoc etirw ot ecin yrev si tI
	*/
	
		
		String str="It is very nice to write code.";
		
		String str1 [] = str.split("");
		
		//System.out.println(Arrays.toString(str1));	
		
		System.out.println(tersCevirme(str1));
	
	}

	private static String tersCevirme(String[] str1) {
		 
		 String ters="";
		
		 for (int i = str1.length-1; i >=0;  i--) {
			
			ters+=str1[i];
		
		 }
	
		return ters;
		
		
	}

}
