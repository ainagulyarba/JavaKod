package ainagulOdev1;

import java.util.Scanner;

public class Ternary5 {

	public static void main(String[] args) {
		// Not: KIZLAR GRUBU :)
		//soru-4 Kullanicidan bir sayi alin, sayi pozitif ise "Sayi pozitif" yazdirin, sayi negatif ise sayinin karesini yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin");
		int sayi = scan.nextInt();
		
		System.out.println(sayi>0 ? "sayi pozitif" : (sayi*sayi));
		
		scan.close();
		
	}

}
