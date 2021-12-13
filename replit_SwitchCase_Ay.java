package Replit;

import java.util.Scanner;

public class replit_SwitchCase_Ay {

	public static void main(String[] args) {
		/*
		 * Bir aydaki gün sayısını hesaplayan bir Java programı yazınız. INPUT: Ay
		 * Numarasi: 2 Yil : 2016 OUTPUT : Subat 2016 29 Gundur.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("ay numarasi giriniz: ");
		int ay = scan.nextInt();

		System.out.println("yil giriniz: ");
		int yil = scan.nextInt();

		switch (ay) {
		case 1:
			System.out.println("Ocak " + yil + " 31 Gundur.");
			break;
		case 2:
			if (yil % 4 == 0) {
				System.out.println("Subat " + yil + " 29 Gundur");
			} else {
				System.out.println("Subat " + yil + " 28 Gundur");
			}
			break;
		case 3:
			System.out.println("Mart " + yil + " 31 Gundur");
			break;
		case 4:
			System.out.println("Nisan" + yil + " 30 Gundur");
			break;
		case 5:
			System.out.println("Mayis " + yil + " 31 Gundur");
			break;
		case 6:
			System.out.println("Haziran " + yil + " 30 Gundur");
			break;
		case 7:
			System.out.println("Temmuz " + yil + " 31 Gundur");
			break;
		case 8:
			System.out.println("Agustos " + yil + " 31 Gundur");
			break;
		case 9:
			System.out.println("Eylul" + yil + " 30 Gundur");
			break;
		case 10:
			System.out.println("Ekim" + yil + " 31 Gundur");
			break;
		case 11:
			System.out.println("Kasim" + yil + " 30 Gundur");
			break;
		case 12:
			System.out.println("Aralik" + yil + " 31 Gundur");
			break;

		default:
			break;
		}

	}

}
