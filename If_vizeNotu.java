package ainagulOdev1;

import java.util.Scanner;

public class If_vizeNotu {

	public static void main(String[] args) {
		
		/*
    	 * Kullanicidan alacaginiz vize1 vize2 ve final notlarini 
    	 * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
    	 */
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Vize1 notunu giriniz");
		int vize1=scan.nextInt();
		System.out.println("vize2 notunu giriniz");
		int vize2=scan.nextInt();
		System.out.println("Final notunuzu giriniz" );
		int fnl=scan.nextInt();
		
		double ortalama=((vize1+vize2)/2)*0.3+fnl*0.7;
		
		System.out.println("ortalama: "+ ortalama);
		
	if (ortalama<=50) {
	System.out.println("Maalesef kaldiniz");
		
	}
	
	if (ortalama>=51) {
		System.out.println("Tebrikler gectiniz");
	}
			
	
		}

	}


