package Replit;

import java.util.Scanner;

public class replit_For_ObebOkek {

	public static void main(String[] args) {
		/*
		 * Kullanıcıdan 2 tamsayı girmesini ve ardından GCD (En Büyük Ortak Bölen) ve
		 * LCM'yi (En Küçük Ortak Kat) bulmasını isteyin. Input : 30 40 Beklenen Cikti:
		 * 30 ve 40 icin GCD = 10 30 ve 40 icin LCM = 120
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 2 tam sayi giriniz: ");

		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		int carpim = sayi1 * sayi2;

		int ebob = 1;
		int ekok = 1;

		for (int i = 1; i <= sayi1 && i <= sayi2; i++) {
			if (sayi1 % i == 0 && sayi2 % i == 0) {
				ebob = i;
				ekok = carpim / ebob;

			}
		}

		System.out.println(sayi1 + " ve " + sayi2 + " GCD = " + ebob + "\n" + sayi1 + " ve " + sayi2 + " LSM = " + ekok);

	}

}
