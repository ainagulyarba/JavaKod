package ainagulOdev1;

import java.util.Scanner;

public class MatemIslem {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
	    */

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir sayi giriniz");

		double sayi = scan.nextDouble();

		System.out.println(Math.abs(sayi));




	}

}
