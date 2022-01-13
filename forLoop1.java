package ainagulOdev1;

import java.util.Scanner;

public class forLoop1 {

	public static void main(String[] args) {
		
		// kullanicidan 2 tam sayi isteyin
		// ilk sayidan baslayarak , ikinci sayiya kadar ucer, ucer yazdirin
		// (ikinci sayi dahil olmak zorunda degil)

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen 2 tam sayi girin: ");
		int sayi1 = scan.nextInt();
		int sayi2 = scan.nextInt();
		
		if (sayi1>sayi2) {
			for (int i = sayi1; i >=sayi2; i-=3) {
				System.out.print(i+" ");
			}
			System.out.println("");
			
		} else if (sayi1<sayi2) {
			for (int i = sayi1; i <=sayi2; i+=3) {
				System.out.print(i + " ");
			}
		} else {
			System.out.println("girdiginiz sayilar esittir");
		}
			
		
		
		
		
		
		
		
		
		
		

	}

}
