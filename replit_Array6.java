package Replit;

import java.lang.reflect.Array;
import java.util.Arrays;

public class replit_Array6 {

	public static void main(String[] args) {
		/*
		 * Write a method that accepts an integer array as input and prints the minimum
		 * and the maximum numbers from given array Input : {3,2,5,4,1,6} Output : min:
		 * 1 max: 6
		 */
		int arr[] = { 3, 2, 5, 4, 1, 6 };

		Arrays.sort(arr);

		System.out.println(Arrays.toString(arr));

		int max = 0;
		int min = 0;

		min = arr[0];
		max = arr[arr.length-1];
		
		System.out.println(min);
		System.out.println(max);
	}

}
