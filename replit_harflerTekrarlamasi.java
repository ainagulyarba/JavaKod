package Replit;

import java.util.Scanner;

public class replit_HarflerTekrarlamasi {

	public static void main(String[] args) {
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir isim giriniz: ");
		String isim = scan.next();

		
		System.out.println(isim.substring(isim.length()-2)+isim.substring(isim.length()-2)+isim.substring(isim.length()-2));
		
		
	}

}
