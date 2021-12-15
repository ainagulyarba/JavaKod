package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
    	/*
		 Create a function that takes an array and returns the difference between
		 and the smallest numbers.
		 Ask user to enter array elements.

		kullanıcının girdigi bir array'in en buyuk elemani ile 
		en kucuk elemanının  farkını bulan bir method create ediniz.
		 */
    	
    	Scanner scan =new Scanner(System.in);
		
		System.out.println("5 tane sayi girin: ");
    	
		int arr[] = new int[5];
		
		for (int i = 0; i < arr.length; i++) {
			
			arr[i]=scan.nextInt();
		}
    	
		Arrays.sort(arr);
    	
    	System.out.println(Arrays.toString(arr));
    	
    	int arr1[]=new int[arr.length];
    	
    	for (int i = 0; i < arr.length; i++) {
			arr1[i]+=arr[i];
		}
    	
    	System.out.println("En buyuk elemani ile en kucuk elemanının  farkı: " + ((arr1[arr.length-1])-arr1[0]));
    	
    	
    }
}
