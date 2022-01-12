package odev_Array;

import java.util.Scanner;

public class AsalSayi {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lütfen pozitif bir sayı giriniz: ");
		int sayi=scan.nextInt();
	
		boolean flag=true;
		
		for (int i = 2; i <= sayi; i++) {	
			if (sayi%sayi==0 && sayi%1==0) {
			flag=false;
			break;
			}	
			
		}	
				System.out.println("Girdiginiz " + sayi + " bir asal sayıdır.");
		
				if (flag) {
			System.out.println("Girdiginiz " + sayi + " asal sayı degildir.");
		}
			
			
		
		
		
		
		
		
		
}
		
		
	}


