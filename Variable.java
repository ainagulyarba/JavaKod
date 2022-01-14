package ainagulOdev1;

import java.util.Scanner;

public class Variable {

	public static void main(String[] args) {
		// Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
		// Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu
		// ortalama 120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?

		Scanner scan = new Scanner(System.in);
		
		System.out.println("mesafeyi giriniz");
		int mesafe = scan.nextInt();
		 
		System.out.println("hizi giriniz");
		int hiz = scan.nextInt();
		
		int zaman = mesafe/hiz ;
		
		System.out.println("varacaginiz sure:  " + zaman + " saat" );
		
		
		
		
	}

}
