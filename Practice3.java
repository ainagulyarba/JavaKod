package Practice_day01;
import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		/*
		 * Kullanicidan boyunu CM ve kilosunu kg alarak BMI (VKE) hesaplayiniz
		 * BMI = kilo(kg) /(boy/100*boy/100)(cm) BMI <=20 oldukca zayifsiniz 20<BMI<=25 Normal
		 * sinirlardasiniz 25<BMI<=30 Sisman kategorisindesiniz 30<BMI ==> Obez
		 * grubundasiniz.
		 */
Scanner scan = new Scanner(System.in);
System.out.println("Lutfen kilonuzu giriniz:");
double kilo = scan.nextDouble();

System.out.println("Lutfen boyunuzu giriniz");
double boy = scan.nextDouble();

double VKE = kilo/(boy/100*boy/100);

if (VKE<=20) {
	System.out.println("oldukca zayifsiniz");
} else if (20<VKE && VKE<=25) {
	System.out.println("normal sinirlardasiniz");
} else if (25<VKE && VKE<=30) {
	System.out.println("sisman kategoridesiniz");
} else if (30<VKE) {
	System.out.println("obez grubundasiniz"); 

} 
}	
}	
	


