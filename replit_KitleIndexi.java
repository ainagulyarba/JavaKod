package Replit;

import java.util.Scanner;

public class replit_KitleIndexi {

	public static void main(String[] args) {
		/*
		 * Kullaniciya kilosunu ve boyunu sorun ve kitle indeksini hesaplayan bir
		 * program yazın (BMI)
		 * IPUCU : BMI = Agirlik(kg) / Boy*Boy (m)
		 * BMI 18,5'in altındaysa zayıfsınız
		 * BMI 18,5 ile 25 arasında ise kilonuz idealdir
		 * BMI 25-30 arasındaysa şişmansınız
		 * BMI 30'dan büyük veya eşitse, obez
		 * Input:
		 * Output:
		 * Agirlik : 71
		 * Boy : 1,72
		 * BMI : 23.99945916711736
		 * Zayifsiniz.
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Kilonuzu giriniz: ");
		double kilo = scan.nextDouble();
		System.out.println("Boyunuzu giriniz: ");
		double boy = scan.nextDouble();
		double BMI = kilo/(boy*boy);
		System.out.println("BMI: " + BMI);
		
		if (BMI<18.5) {
			System.out.println("Zayifsiniz");
		} else if (BMI>18.5 && BMI<25) {
			System.out.println("Kilonuz ideal");
		} else if (BMI>25&& BMI<30) {
			System.out.println("Sismansiniz");
		} else if (BMI>=30) {
			System.out.println("Obez");
		} else {

		}
		
		

		
		
		
	}

}
