package Replit;

import java.util.Scanner;

public class replit11_forLoopYenilenenKarakter {

	public static void main(String[] args) {
		
		// Bir String icerisinde yinelenen karakterleri döndüren bir kod
		// yazıniz.(mülakat Sorusu)

		// Input :

		// String str=“Javaisalsoeasy�?

		// Output: a s

		String str = "Javaisalsoeasy";
		String harf = "";

		for (int i = 0; i < str.length(); i++) {

			if (str.indexOf(str.charAt(i)) != str.lastIndexOf(str.charAt(i))) {

				if (!harf.contains(str.substring(i, i + 1))) {
					harf += str.substring(i, i + 1) + " ";
				}
			}
		}

		System.out.println(harf);

	}
}
