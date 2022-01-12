package odev_Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class tekSayiMethod {

	public static void main(String[] args) {
		// Kullanicidan alacaginiz 6 elemanli bir dizinin
        // sadece tek elemanlarini ayri diziye bir metodda atayarak
        // main de yazdiriniz.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen 6 adet sayi giriniz: ");
		
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();
		int sayi4 = scan.nextInt();
		int sayi5 = scan.nextInt();
		int sayi6 = scan.nextInt();
		
		int arr [] = {sayi1,sayi2,sayi3,sayi4,sayi5,sayi6};
		
		
		System.out.println(tekEleman(arr));
	
	}

	private static List<Integer> tekEleman(int[] arr) {
		
		List<Integer> tekSayi= new ArrayList <>();
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]%2!=0) {
				
				tekSayi.add( arr[i]);
					
			}
			
		}

		return tekSayi;
	
		
		
		
		
		
		
		
		
		
		
	}

}
