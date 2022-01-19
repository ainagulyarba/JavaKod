package Practice_day01;

import java.util.Scanner;
import java.util.regex.Pattern;

public class practice4 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan 1 harf (karakter) aliniz ve 
		 * bunun buyuk harf, kucuk harf yada
		 * hatali giris seklinde kod yazniz
		 */

		//Scanner scan =new Scanner(System.in);
		//System.out.println("Lutfen bir harf(karakter) yaziniz ");
		char harf = 'm';
		if (harf=='A'&& harf=='Z') {
			System.out.println(harf + " buyuk harf");
		} else if (harf=='a' && harf=='z') {
			System.out.println(harf + " kucuk harf");
		} {
			System.out.println(harf + " hatali giris");
		}
		
		
		
		
		
	}

}
