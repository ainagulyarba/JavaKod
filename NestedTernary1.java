package ainagulOdev1;

import java.util.Scanner;

public class NestedTernary1 {

	public static void main(String[] args) {
		
		// Kullanicidan dikdörtgenin uzunluğunu ve genişliğini alin,
		// girilen değerlere gore dikdotgenin kare olup olmadigini yazdirin 

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen dikdertkenin uzunlugunu girin");
		double uzunluk = scan.nextDouble();
		System.out.println("Lutfen dikdortkenin genisligini girin");
		double genislik = scan.nextDouble();
		
		String sonuc = uzunluk>0 && genislik>0 ? (uzunluk==genislik ? "karedir" : "kare degildir") : ("pozitif sayi giriniz");
		
		System.out.println(sonuc);
		
		
		
	}

}
