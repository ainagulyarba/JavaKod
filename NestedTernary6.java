package ainagulOdev1;

import java.util.Scanner;

public class NestedTernary6 {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve sayi 3 basamakli ise “uc basamakli sayi”,
		// yoksa “UcBasamakli degil” yazdirin
		 
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen sayi giriniz");
		int sayi = scan.nextInt();

		
		System.out.println(sayi<0 ? "pozitif sayi giriniz" : sayi>99 && sayi<1000 ? "uc basamakli sayi" : "uc basamakli degil" );

	}

}
