package ainagulOdev1;

import java.util.Scanner;

public class Ternary3 {

	public static void main(String[] args) {
		// Not: KUZLAR GRUBU :)
		// soru-2 kullanıcıdan alınan sayının tek veya çift oldugunu söyleme

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tam sayi giriniz");
		
		int sayi = scan.nextInt();
		
		System.out.println((sayi%2==0) ? "girdiginiz sayi ciftir" : "girdiginiz sayi tektir");
		
		scan.close();
	}

}
