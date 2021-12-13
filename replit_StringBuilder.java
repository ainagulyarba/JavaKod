package Replit;

import java.util.Scanner;

public class replit_StringBuilder {

	public static void main(String[] args) {
		//Write a java program which accept a sentence as parameter,
		//than reverses sentence by using StringBuilder
		//and checks if sentence is palindrome or not (without case sensitivity) 
		//Eg : input : I love Java Output: "Reversed sentence : avaJ evol I . It is not a palindrome"
	
	

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bit metin giriniz: ");
		
		String metin = scan.nextLine();
		StringBuilder sb = new StringBuilder(metin);
		
		String tersMetin = sb.reverse().toString();
		
		if (tersMetin.equalsIgnoreCase(metin)) {
			System.out.println("Girilen metin polindrom ifadedir "+tersMetin);
		} else {
			System.out.println("Girilen metin polindrom ifade degildir "+tersMetin);
		}
		
	
	
	
	}

}
