package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q11_BuyukKucukSayiFarki {
    public static void main(String[] args) {
    	/*
		 Create a function that takes an array and returns the difference between
		 and the smallest numbers.
		 Ask user to enter array elements.

		kullanicinin girdigi bir array'in en buyuk elemani ile 
		en kucuk elemaninin  farkini bulan bir method create ediniz.
		 */
    	
    	Scanner scan =new Scanner(System.in);
		
		System.out.println("5 tane tam sayi girin: ");
    	
		int arr[] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=scan.nextInt();
		}
    	
		fark(arr);	
    	
    }

	private static void fark(int[] arr) {
	
		Arrays.sort(arr);
    	
    	System.out.println(Arrays.toString(arr));
    	
    	System.out.println("En buyuk elemani ile en kucuk elemanin  farki: " + ((arr[arr.length-1])-arr[0]));
    	
	}
}
