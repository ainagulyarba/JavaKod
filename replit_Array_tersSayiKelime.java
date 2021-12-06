package Replit;

import java.util.Arrays;

public class replit_Array_tersSayiKelime {

	public static void main(String[] args) {

		 // Write a return method to reverse number. Input : 12345 Output : 54321
		
		int arr[]= {1,2,3,4,5};
		
		int tersArray []=new int[arr.length];
		
		
		for (int i = 0; i < tersArray.length; i++) {
			
			tersArray[i]+=arr[arr.length-1-i];
		
		}
		
		System.out.print(Arrays.toString(tersArray));
		
		System.out.println();
		
		/*
		 * Write a Java program that reverse a sentence by using Array (with all spaces
		 * and special characters). Input : Coding is greate. Output : .etaerg si gnidoC
		*/

		String cumle= "Coding is greate";
		
		String arr1[]=cumle.split("");
		
		String ters1[] = new String[arr1.length];
		
		String ters ="";
		
		for (int i=0; i <arr1.length ; i++) {
			
			ters+=arr1[arr1.length-1-i];
			
			ters1[i]=arr1[arr1.length-1-i];
			
			
		}
		
		System.out.println(ters);
		
		System.out.println(Arrays.toString(ters1));
				
	
		
		
		StringBuilder cumle1 =new StringBuilder(cumle);
		cumle1.reverse();   //StrinBuilder ile ters yazdirma
		
		System.out.println(cumle1);
		
		
		
	}
		
	}


