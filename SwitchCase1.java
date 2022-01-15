package ainagulOdev1;

import java.util.Scanner;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		// kullanicidan ay ismi isteyin ve hangi mevsim oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lutfen ay ismi girin");
		
		String ayIsmi = scan.next().toLowerCase();
		
		
		switch (ayIsmi) {
		
		case "eylul" :
		
		case "ekim" :
			
		case "kasim" : 
			System.out.println("sonbahar");
			break;
		case "aralik" :
			
		case "ocak" :
			
		case "subat" :
			System.out.println("kis");
			break ;
		case "mart" :
			
		case "nisan" : 
			
		case "mayis" :
			System.out.println("ilkbahar");
			break;
		case "haziran" :
			
		case "temmuz" :
			
		case "agustos" :
			System.out.println("yaz");
			break;
			
			default :
				System.out.println("lutfen gecerli bir ay giriniz");
			
	
		}
		
		
	}


	}


