package ainagulOdev1;

import java.util.Scanner;

public class Soru4_StrManipulation {

	public static void main(String[] args) {
		// Soru 4) Kullanicidan isim ve soyismini isteyin
		// ve hangisinin daha uzun oldugunu yazdirin.

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen isim ve soyisim giriniz");
		
		String isim = scan.next();
		String soyisim =scan.next();
		
		if (isim.length()<soyisim.length()) {
			System.out.println("soyisimiz isminizden uzundur");
		} else {
			System.out.println("isminiz soyisminizden uzundur");
		}
		
		// System.out.println(isim.length()<soyisim.length()? "soyisimiz isminizden uzundur":"isminiz soyisminizden uzundur" );
		// 2.ternary () ile de yapilabilir
		
		
		
	}

}
