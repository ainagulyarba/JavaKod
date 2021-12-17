package interviewPrep;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q12 {
	public static void main(String[] args) {
		/*
		 * Crteate a program checks if a String is PALINDROME or not. If a word, phrase,
		 * or sequence that reads the same backword as forward then it is called
		 * "palindrome", For Example : "madam" or "nurses run" .
		 * 
		 * Kullanıcının girdiği bir String'in PALINDROME olup olmadığını kontrol eden
		 * bir method create ediniz polindrome :Palindrom, tersten okunuşu da aynı olan
		 * cümle ornek : Ey edip Adana`da pide ye, Traş niçin şart
		 * 
		 */

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen bir metin giriniz: ");
		
		String metin = scan.nextLine();

		polindrom(metin);

	}

	private static void polindrom(String metin) {

		String tersMetin = "";

		for (int i = metin.length() - 1; i >= 0; i--) {

			tersMetin += metin.charAt(i);
		}
		
		System.out.println(tersMetin);

		if (tersMetin.equalsIgnoreCase(metin)) {
			
			System.out.println("Girdiginiz metin PALINDROME'dur");
		
		} else {
			
			System.out.println("Girdiginiz metin PALINDROME degildir");
		}

	}
}
