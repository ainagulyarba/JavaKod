package ainagulOdev1;

import java.util.Scanner;

public class Ternary1 {

	public static void main(String[] args) {
		// not: KIZLAR GRUBU:)
		// kullanicidan iki sayi alin ve buyuk olmayan sayiyi yazdirin
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen iki sayi girin");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		int sonuc = sayi1<sayi2 ? sayi1:sayi2;

		System.out.println(sayi1<sayi2 ? sayi1:sayi2);
	   
		System.out.println("girdiginiz sayilardan buyuk olmayan sayi: " + sonuc );
}
}
