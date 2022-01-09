package interviewPrep;

import java.util.Scanner;

public class Q09_AsalSayi_Prime {
	public static void main(String[] args) {
		/*
		 * Ask user enter a positive number and check if it is prime or not
		 * Kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadığını
		 * kontrol edin
		 */
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a number : ");
		int num = scan.nextInt();
		boolean flag = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			System.out.println("it is prime");
		else
			System.out.println("it is not prime");

	}
}
