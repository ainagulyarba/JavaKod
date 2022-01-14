package ainagulOdev1;

import java.util.Scanner;

public class variable2 {

	public static void main(String[] args) {
		
	/*
	 * kullanicinin ad soyad yas boy kilosunu yazdirin
	 */
		
	Scanner scan = new Scanner(System.in);
	String name, surname;
	
	 String age;
	 String kilo;
	 String boy;
	
	System.out.print("Adinizi girin: ");
	name=scan.nextLine();
	
	System.out.print("Soyadinizi girin: ");
	surname=scan.nextLine();
	
	System.out.print("Yasinizi girin: ");
	age=scan.nextLine();
	
	System.out.print("Boyunuzu girin: ");
	boy=scan.nextLine();
	
	System.out.print("Kilonuzu girin: ");
	kilo=scan.nextLine();
	
	System.out.print("Benim adim: " + name + "\n" + "Soyadim: " + surname + "\n" + "Yasim: " + age + "\n" + "Boyum: " + boy + "\n" + "Kilom: " + kilo);
	
	
		
		

	}

}
