package Replit;

import java.util.Scanner;

public class replit7ForLoopMukSayi {

	public static void main(String[] args) {
		//Sayinin Mükemmel sayı olup olmadığını kontrol eden Java kodunu yazın.
		//Sayının kendisi hariç pozitif bölenlerinin toplamı o sayıya eşitse,
		//herhangi bir sayı Mükemmel Sayı olarak bilinir.
		//Input :
		//6
		//Output:
		//6 Mukemmel Sayidir.
		//======================
		//Input
		//7
		//Output:
		//7 Mukemmel Sayidir degildir.

		Scanner scan = new Scanner(System.in);
		System.out.println("bir sayi giriniz: ");
		int sayi =scan.nextInt();//4
		int toplam=0;//1+2+
		for (int i = 1; i < sayi; i++) {
			if (sayi%i==0) {
				toplam+=i;
				
			}
				
		}
		
		if (sayi==toplam) {
			System.out.println(sayi + " Mukemmel sayidir.");
		} else {
			System.out.println(sayi + " Mukemmel degildir.");
		}	
		
		
		
		
		
		
		
		
		
		
		
	}

}
