package ainagulOdev1;

import java.util.Scanner;

class Soru1_Method_Creation {

	public static void main(String[] args) {

		// Soru 1 ) Kullanicidan bir sayi alin.
		// Bu sayinin tek mi cift mi oldugunu,
		// sifirdan buyuk mu, kucuk mu oldugunu,
		// ayrica ve 100’den buyukse birler,onlar ve yuzler basamagindaki rakamlarin toplamini,
		// 100’den kucukse sadece 1’ler basamagini yazdiran 3 method olusturun.

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen sayi giriniz: ");
		
		int sayi = scan.nextInt();
		
		//tekCift(sayi);
		//buyukKucuk(sayi);
		//rakamToplami(sayi);
		
		
	}

	public static void rakamToplami(int sayi) {
		if (sayi>100) {
			System.out.println((sayi/100)%10 + (sayi/10)%10 + sayi%10);
		
		} else if(sayi<100){
			System.out.println(sayi%10);
		}
		
	}

	public static void buyukKucuk(int sayi) {
		int buyukKucuk = sayi;
		System.out.println(sayi>=0 ? "sayiniz sifirdan buyuk" : "sayiniz sifirdan kucuk");
		
	}

	public static void tekCift(int sayi) {
		int tekCift = sayi;
		System.out.println(sayi%2==0 ? "cift sayi" : "tek sayi");
		
	}

}
