package ainagulOdev1;

import java.util.Scanner;

public class SwitchCase3 {

	public static void main(String[] args) {
		
		/*
		 * Kullanicidan iki tamsayi sayi ve islem cinsini alin 
		 * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.
		 * 
		 * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme
		 * 
		 * Ornek : Inputs : sayilar : 18 , 10  islem : 3
		 *         Output : 18 X 10 = 180
		 * 
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("iki tam sayi giriniz");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		System.out.println("yapmak istediginiz islemi seciniz: \n 1:toplama \n 2:cikarma \n 3:carpma \n 4: bolme");
		
		int islem = scan.nextInt();
		
		switch (islem) {
		
		case 1 :
			System.out.println(sayi1+sayi2);
			break;
		case 2 : 
			System.out.println(sayi1-sayi2);
			break;
		case 3 :
			System.out.println(sayi1*sayi2);
			break;
		case 4 : 
			System.out.println(sayi1/sayi2);
			break;
		
		default :
			System.out.println("Lutfen gecerli tam sayi giriniz");
		
		}
			

	}

}
