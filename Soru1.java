package practiceSorular;

import java.util.Arrays;

public class Soru1 {

	public static void main(String[] args) {
		/*1---Sayının Sayı değerlerinin toplamasını yapan Java kodu yazınız. ​ Test
		 * Data 34 Beklenen Çıktı 7
		 */
		
		String sayi="67";
		
		String sayi1[]=sayi.split("");
		System.out.println(Arrays.toString(sayi1));
		int toplam=0;
		for (String w : sayi1) {
			toplam+=Integer.parseInt(w);
		}
		
		System.out.println(toplam);
	}

}
