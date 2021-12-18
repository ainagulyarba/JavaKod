package Replit;

import java.util.Scanner;

public class replitIfSwitch {

	public static void main(String[] args) {
		/*
		 * Verilen iki sayinin (sifirdan buyuk veya sifira esit) toplamini hesaplayan ve
		 * yazdiran bir Java programi yazin. Verilen tamsayilar veya toplam 10'dan fazla
		 * basamakli olursa, "OverFlow" yazdirin. 
		 * Ornek: INPUT : 25 46 
		 * OUTPUT : Numaralarin Toplami: 71
		 */
		
		Scanner scan =new Scanner(System.in);
		System.out.println("lutfen iki sayi giriniz: ");
		double sayi1 = scan.nextDouble();
		double sayi2 = scan.nextDouble();
		double toplam = 0;
		
	if (sayi1>=0 && sayi2>=0 ){
		toplam=sayi1+sayi2;
		
		System.out.println("Sayilarin Toplami:"+"\n"+ toplam);
	
	} 
	
	if (sayi1>=1000000000 || sayi2>=1000000000 || toplam>=1000000000) {
		
		System.out.println("OverFlow");
	}
	
	
		
		
	}

}
