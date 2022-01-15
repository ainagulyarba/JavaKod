package ainagulOdev1;

import java.util.Scanner;

public class SwitchCase2 {

	public static void main(String[] args) {
		// Not: KIZLAR GRUBU:)
		/*   Soru 4 :   Kullanicidan SDET kisaltmasindaki harflerden birini yazmasini isteyin
        Kullanici S girerse "Software"
        D girerse "Developer"
        E girerse "Engineer"
        T girerse “In Testing” yazdirin        
        */

		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen SDET harflerinden birine giriniz ");
		char harf = scan.next().toUpperCase().charAt(0);
		
		switch (harf) {
		
		case 'S' :
			System.out.println("Software");
			break;
		case 'D' :
			System.out.println("Developper");
			break;
		case 'E' :
			System.out.println("Engineer");
			break;
		case 'T' :
			System.out.println("In Testing");
			break;
			
			default :
				System.out.println("gecerli harf giriniz");
		
		
		
		
		
		
		
		}
			
		
		
		
		
		
	}

}
