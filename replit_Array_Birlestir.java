package Replit;

import java.util.Arrays;

public class replit_Array_Birlestir {

	public static void main(String[] args) {
		
		int arr1[]= {1,2,3,4};
		int arr2[]= {5,6} ;
		
		int birles [] = birlesikArray(arr1,arr2);
		
		System.out.println(Arrays.toString(birles));
		
	}

		private static int[] birlesikArray(int[] arr1, int[] arr2) {
			
			int birles[]=new int [arr1.length+arr2.length];
			
			for (int i = 0; i < arr1.length; i++) {
			
				birles[i]=arr1[i];
				
			}	
		
			for (int i = 0; i < arr2.length; i++) {
				
				birles[i+arr1.length]=arr2[i];
				
			}
				
			return birles;
			

	}

}
