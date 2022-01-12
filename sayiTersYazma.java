package odev_Array;
import java.util.Scanner;

public class sayiTersYazma {

	public static void main(String[] args) {
		 
		Scanner scan = new Scanner(System.in);
			System.out.println("Lutfen bir sayi giriniz: ");
			String sayi =scan.next();
			String tersSayi="";
			for (int i = sayi.length()-1; i >=0; i--) {
			tersSayi+=sayi.substring(i,i+1);	
			}  
				
	System.out.print("Girilen Numananin Tersi: "+tersSayi); 


	}

}
