package Replit;

import java.util.Scanner;

public class replit_SwitchCase {

	public static void main(String[] args) {
		/*
		 * Char değişken yanıtının değerini test eden ve aşağıdaki işlemleri
		 * gerçekleştiren bir switch ifadesi yazın:
		 * yanıt a ise,
		 * "Talebiniz işleniyor" mesajı yazdırılır
		 * yanıt b ise,
		 * "yine de ilgilendiğiniz için teşekkür ederiz" mesajı yazdırılır 
		 * yanıt c ise,
		 * "Üzgünüz, şu anda herhangi bir yardım yok" mesajı yazdırılır
		 * başka herhangi bir yanıt değeri için,
		 * "Geçersiz giriş, lütfen tekrar deneyin!" yazdırılır
		 */
		
	Scanner scan =new Scanner(System.in);
	System.out.println("lutfen yanit icin bir harf giriniz:");
		char yanit =scan.next().toLowerCase().charAt(0);
		int ascii = (int)yanit;
		System.out.println(ascii);
	
		switch (yanit) {
		case 'a':
			System.out.println("Talebiniz isleniyor");
			break;
		case 'b':
			System.out.println("yine de ilgilendiğiniz için teşekkür ederiz");
			break;
		case 'c':
			System.out.println("Üzgünüz, şu anda herhangi bir yardım yok");
			break;
		default:
			System.out.println("Geçersiz giriş, lütfen tekrar deneyin!");
			break;
		}
		
	}

}
