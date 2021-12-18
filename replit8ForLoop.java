package Replit;

import java.util.Scanner;

public class replit8ForLoop {

	public static void main(String[] args) {
		/*	
		Kullanicidan bir isim ve bir karakter girmesini isteyin, 
		ardindan donguleri kullanarak karakterin isimde kac kez tekrarlandigini kontrol edin.
		char ch1= 'a' ;
		String name ="John came late";
		Expected Output: 
		Number of a = 2
		*/	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir isim  giriniz: ");
		
		String isim = scan.nextLine();
		System.out.println("lutfen bir karakter yaziniz");
		
		char karakter =scan.next().charAt(0);
		
		int sayac =0;
		
		for (int i = 0; i <=isim.length()-1; i++) {
			
			if (karakter==isim.charAt(i)) {
				
				sayac+=1;
				
				
			}
			
			
		}
		
		System.out.println(karakter+" girilen ismin icinde " + sayac +" defa var");
		
		scan.close();
		

	}

}
