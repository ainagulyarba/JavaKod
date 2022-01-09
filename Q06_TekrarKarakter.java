package interviewPrep;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q06_TekrarKarakter {
	public static void main(String[] args) {
		/*
		 * Create method that finds repeated characters in a String Bir String'de
		 * tekrarlanan karakterleri bulan method create ediniz
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String str3 = scan.nextLine();
		str3 = str3.replaceAll(" ", ""); // String Manupaltion kullandim girilen cumle deki bosluklari da
										// tekrar eden karakter olarak algilamasin diye bosluklari kaldirdim
		List<String> list = new ArrayList<>();
		int sayac = 0;
		for (int i = 0; i < str3.length() - 1; i++) {

			sayac = 0;

			for (int j = i + 1; j < str3.length(); j++) {
				if (str3.substring(i).charAt(0) == str3.substring(j).charAt(0)) {// char olarak karakterleri kiyasladim
																				// ifadeler esit olsada
					// referans ve degerler esit olmayacagindan reel sonuc alamazdim
					sayac++;
				}

			}
			if (sayac > 0 && !list.contains(str3.substring(i, i + 1))) {
				// sayac'in o dan buyuk ve bir deger sartimizda list icinde tekrar eden
				// karakterin olup olmadigina bakmamiz gerekiyor
				// eger sayac 0'da buyuk ve list icinde karakter yoksa body icine girip list'e
				// karakteri ekliyoruz
				list.add(str3.substring(i, i + 1));

			}

		}
		System.out.println("Tekrar eden karakterler : " + list);
		
	
		System.out.println("=======2.yol=======");

	String str1 = "Yinelenen karakter";
    String str2 ="";
    
    for (int l = 0; l < str1.length(); l++) {
        
        for (int j = l+1; j < str1.length();j++) {
            
            if (str1.charAt(l)==str1.charAt(j) && !str2.contains(str1.substring(l, l+1)) ) {
                str2+=str1.charAt(l)+" ";
            }
        }
    }
    
    System.out.println(str2);
    
System.out.println("==========3.yol===========");

String str = "Yinelenen karakterler";
List<String> tekrarEden = new ArrayList<>();
for (int m = 0; m < str.length(); m++) {
    for (int j = m + 1; j < str.length(); j++) {
        if (str.charAt(m) == str.charAt(j) && !tekrarEden.contains(str.substring(m, m + 1))) {
            tekrarEden.add(str.substring(m, m + 1));
        }
    }
}
System.out.println(tekrarEden);

}}       
