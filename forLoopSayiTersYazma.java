package ainagulOdev1;

import java.util.Scanner;

public class forLoopSayiTersYazma {

	public static void main(String[] args) {
	
		//Kullanıcının girdiği sayıyı tersine çeviren bir java programı yazınız. (Mulakat Sorusu)

		//Input :1238

		//Output :Girilen Numananin Tersi: 8321

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir sayi girin: ");
		String sayi = scan.next();
		
		for (int i = sayi.length()-1; i >=0; i--) {
			
			System.out.print(sayi.substring(i,i+1)); 
		
			
		}
		
		
		
		
	}	
		
	
	}
		
				
			
		
		
		
		
		
		
		

			
		
	


