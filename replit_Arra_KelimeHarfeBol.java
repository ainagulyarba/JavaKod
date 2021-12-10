package Replit;

import java.util.Arrays;

public class replit_Arra_KelimeHarfeBol {

	public static void main(String[] args) {
		
	
		String isim ="John";
		
		String kelimeler []= isim.split("");
		
		System.out.println(Arrays.toString(kelimeler));
		
		split(kelimeler);
		
		
		System.out.println(Arrays.toString(kelimeler));
		

		}

	
	private static String [] split(String[] kelimeler) {
			
			for (int i = 0; i < kelimeler.length; i++) {
				
				kelimeler[i]=kelimeler[i].replace("\\W", "");
			}
			
			return kelimeler;
				
	}

}
