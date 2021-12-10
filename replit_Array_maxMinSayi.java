package Replit;

import java.util.Arrays;

public class replit_Array_maxMinSayi {

	public static void main(String[] args) {
		
		 int arr[] = { 3, 2, 5, 4, 1, 6 };

			Arrays.sort(arr);

			System.out.println(Arrays.toString(arr));

			
			deger(arr);
			
			
	}

	private static void deger(int[] arr) {
		int max = 0;
		int min = 0;

		min = arr[0];
		max = arr[arr.length-1];

		System.out.println("min: "+ min);
		System.out.println("max: "+ max);
		
	}

}
