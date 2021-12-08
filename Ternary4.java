package ainagulOdev1;

import java.util.Scanner;

public class Ternary4 {

	public static void main(String[] args) {
		// Not: KIZLAR GRUBU :)
		//soru-3 kullanicidan bir sayi alin ve sayinin Mutlak değerini yazdirin
		
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Lutfen bir sayi yazin");
		 double sayi = scan.nextDouble();
		 
		 double mutlakDeger=(sayi>=0 ?  sayi : (-1)*sayi );
		
		 System.out.println(mutlakDeger);
		 
		 scan.close();
	}

}
