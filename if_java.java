package ainagulOdev1;

import java.util.Scanner;

public class if_java {

	public static void main(String[] args) {
		// Kullanicidan bir gun alin eger gun “Cuma” ise ekrana “Muslumanlar icin kutsal
		// gun” yazdirin. “Cumartesi” ise ekrana “Yahudiler icin kutsal gun” yazdirin. “Pazar”
		// ise ekrana “Hiristiyanlar icin kutsal gun” yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gun ismi yaziniz");
		
		String gun=scan.next().toLowerCase();
		
		if (gun.equals("cuma")) {
			System.out.println("Muslumanlar icin kutsal bir gun");
			}
			
		if (gun.equals("cumartesi")) {
				System.out.println("Yahudiler icin kutsal bir gun");
				
			}
			
		if (gun.equals("pazar")) {
			System.out.println("hristiyanlar icin kutsal bir gun");
			
			
		}
			
	}
}
		



