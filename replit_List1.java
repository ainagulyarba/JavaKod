package Replit;

import java.util.Arrays;

public class replit_List1 {

	public static void main(String[] args) {
		
		/* Write a Java program to get a String from user as input and find the maximum
		 * occurring character in that string. (Ignore case sensitivity)
		 * input : Learning java is easy 
		 * output: maximum occurring character is : a
		 */
		
		String str = "Learning java is easy";
		
		String str1[]=str.split("");
		
		int sayac=0;
		
		int max=0;//1;2;4
		
		String bos="";
		
		for (int i = 0; i <str.length()-1; i++) {
			
			for (int j = 0; j < str.length()-1; j++) {
				
				if (str1[i].equalsIgnoreCase(str1[j])) {
					
					sayac++;
					
				}	
				}
			
			if (sayac>max) { 
				
				max=sayac;
				bos=str1[i];
				
			}
			sayac=0;
			}
			
			System.out.print("maximum occurring character is : " + bos);
			
		}
		
		
		
	}


