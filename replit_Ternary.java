package Replit;

import java.util.Scanner;

public class replit_Ternary {

	public static void main(String[] args) {
		
		
		
		 Scanner scan =new Scanner(System.in);
			System.out.println("Lutfen adinizi girin,isim en az 3 harften olusmali");
			String isim=scan.nextLine();
			char c1=isim.charAt(0);
			char c2=isim.charAt(1);
			char c3=isim.charAt(2);
			
			String sonuc = isim.length()==3 ? (c1==c2 && c1==c3)? "isim ayni karakterlere sahiptir."
										:"Dizenin benzersiz karakterleri var"
										:"girdigin isim 3 harfli degil";
			
			System.out.println(sonuc); 
			


	}

}
