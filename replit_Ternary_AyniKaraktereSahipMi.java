package Replit;

import java.util.Scanner;

public class replit_Ternary_AyniKaraktereSahipMi {

	public static void main(String[] args) {
		/* Kullanıcıdan bir isim yazmasını isteyin, adın uzunluğu 3 olmalıdır. Ardından,
		 * adın aynı karakterlere sahip olup olmadığını kontrol edin.
		 * Eger aynı karakterlere sahipse
		 * "isim ayni karakterlere sahiptir." yazdirin.
		 * Eger ayni karakterlere sahip degilse
		 * "Dizenin benzersiz karakterleri var" yazdirin.
		 * Ternary kullanin.
		 */

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen adinizi girin,isim en az 3 harften olusmali");
		String isim=scan.nextLine();
		char c1=isim.charAt(0);
		char c2=isim.charAt(1);
		char c3=isim.charAt(2);
		
		String sonuc = isim.length()==3 ? (c1!=c2 && c1!=c3 && c2!=c3)? 
									"Dizenin benzersiz karakterleri var":
									"isim ayni karakterlere sahiptir.":
									"girdigin isim 3 harfli degil";
		
		System.out.println(sonuc); 
		
		
	scan.close();	
	}

}
