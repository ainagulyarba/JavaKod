package ainagulOdev1;

import java.util.Scanner;

public class Soru6_StringManipulation_Sifre {

	public static void main(String[] args) {
		// Soru 6) Kullanicidan bir sifre girmesini isteyin. Asagidaki sartlari
		// sagliyorsa “Sifre basari ile tanimlandi”, sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir
		// sifre girin” yazdirin
		// - Ilk harf buyuk harf olmali
		// - Son harf kucuk harf olmali
		// - Sifre bosluk icermemeli
		// - Sifre uzunlugu en az 8 karakter olmali
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir sifre giriniz");
		
		String sifre = scan.next();
		int flag = 0;
		
		if (!(sifre.charAt(0)>='A'&& sifre.charAt(0)<='Z')) {
			System.out.println("Lutfen sifreyi buyuk harfle baslayin");
			flag++;
		}
		if (!(sifre.charAt(sifre.length()-1)>='a'&& sifre.charAt(sifre.length()-1)<='z')) {
			System.out.println("Lutfen sifrenin son harfini kucuk yaziniz");
			flag++;
		}	
		if (sifre.contains(" ")) {
				System.out.println("Lutfen sifrenizde bosluk birakmayiniz");
			flag++;
		}
		if (sifre.length()<8) {
				System.out.println("sifre en az 8 karakter olmali");
				}
		if (flag==0) {
					System.out.println("Sifre basari ile tanimlandi");
				} else {
					System.out.println("Islem basarisiz,Lutfen yeni bir sifre girin");
				
				
			
			
			
			
			}
		

		
		
		
		
		
		
		
	}

}
