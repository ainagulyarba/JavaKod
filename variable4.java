package ainagulOdev1;

import java.util.Scanner;

public class variable4 {

	public static void main(String[] args) {

		// Soru: Kullanicidan 3 tamsayi alin ve
		// bu sayilarin ortalamasini bulun
		// Ornek : Inputs : 15,25,50
		// Output: Girdiginiz 15,25 ve 50'nin ortalama degeri :30

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen uc tam sayi giriniz: ");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int sayi3 = scan.nextInt();

		int ortalama = (sayi1 + sayi2 + sayi3) / 3;
		System.out.println("Girdiginiz sayilarin ortalamasi: " + ortalama);

	}

}
