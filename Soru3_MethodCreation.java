package ainagulOdev1;

import java.util.Scanner;

public class Soru3_MethodCreation {

	public static void main(String[] args) {
		
		//Soru 3) Email kontrolu yapan bir program yazin.Kullanicinin girdigi sifre
		//- @ isareti icermiyorsa gecersiz email yazdirin
		//- @gmail.com icermiyorsa "lutfen gmail adresinizi girin" yazdirin
		//- @gmail.com ile bitmiyorsa "Yazimda bir sorun var, maili kontrol ediniz"
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen gmail adresinizi yazin: ");
		String mail = scan.nextLine();
		gmailAdres(mail);

	}

	
	public static void gmailAdres(String mail) {
		
	
		if (!mail.contains("@")) {
			System.out.println("gecersiz email");
		} else if (!mail.contains("@gmail.com")) {
			System.out.println("Lutfen gmail adresinizi girin");
		} else if (!mail.endsWith("@gmail.com")) {
			System.out.println("Yazimda bir sorun var, mail'i kontrol ediniz");
		} else {
			System.out.println("Mail girisiniz basarili");
		
		}
	}
}


