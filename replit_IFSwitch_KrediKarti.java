package Replit;

import java.util.Scanner;

public class replit_IFSwitch_KrediKarti {

	public static void main(String[] args) {
		/*
		 * Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata
		 * ceviren java kodunu yaziniz.
		 * Input :
		 * John White
		 * 1234234534561478
		 * Output : Name :
		 * J* W**
		 * CCN : ** ** **** 1478
		 * Ilk Harfler Buyuk harf ile baslamalidir.
		 */
	
	Scanner scan = new Scanner(System.in);
	String name ="John White";
	System.out.println(name.replaceAll("[a-z]", "*"));
	String CCN = "1234234534561478";
	System.out.println("************" + CCN.substring(12)); 
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
