package Replit;

public class replit13CiftSayiYaz {

	public static void main(String[] args) {
		/*
		 * Girdi olarak bir tamsayı kabul eden ve faktöriyel hesaplayan programi
		 * yazıniz.
		 * 
		 * Input : 6
		 * 
		 * Output: 6!=65432*1=720
		 */

		int sayi =6;
		int carpim=1;
		for (int i = 1; i <=6; i++) {
			
			carpim*=i;
					
		}
		
		System.out.print("6!=65432*1="+carpim);
		
		
	}

}
