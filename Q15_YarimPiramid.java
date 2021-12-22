package interviewPrep;

import java.util.Scanner;

public class Q15_YarimPiramid {
	public static void main(String[] args) {
		/*
		 * Ask user to enter the number of lines of a half pyramid. Type a program to
		 * create the half pyramid. For exampleif the number of lines is 5, the pyramid
		 * will be like;
		 *
		 * * * * * * * * * 
		 * Kullanıcının girdigi satır sayısı kadar yarım piramid sekli yazdıran bir
		 * program create ediniz.
		 *   *
		 *   * *
		 *   * * *
		 *   * * * *
		 *   * * * * *
		 */

		int sayi = 5;
		for (int i = 0; i < sayi; i++) {
			for (int j = 0; j <=i; j++) {
				
					System.out.print("* ");
			}
				System.out.println();

			}
			
		}
	
}
