package Practice_day01;
import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		
		/*
        1.Kullanıcıya    "Vize sınav sonucunuzu giriniz :"
        2.vize notu double değerinde girilecek.
        3. Kullanıcıya  "Vize sınavı yüzdesini giriniz". ->> double olmalı ->> 0,40 etkiliyor   !!Yüzde kaç etkilediğini Sisteme siz giriyorsunuz.!!
        4.Kullanıcıya    "Final sınav sonucunuzu giriniz.
        5. final notu double değerinde olmalı. (örn: 65,5)
        6.Kullanıcıya    "Final sınavı yüzdesini giriniz"-->> double olmalı ->> 0,60 etkiliyor.
        7. Vize final ortalamasını bulmak için, vize nin yüzde40 ı, finalin yüzde60 ı alınmalı ve çıkan sonuçlar toplanmalıdır.
        8. Çıkan sonucu (dersin not ortalamasını)   double toplam  ' a eşitleyebilirsiniz.
        todo  :  Koşul kısmı
            eğer ortalaması 90(90 dahil) 'dan büyük ise, harf notu olarak 
            AA, 80(80dahil)   ile 90 arasında ise  
            BA, 70(70 dahil)   ile 80 arasında ise 
            BB, 60(60dahil) ile 70 arasında ise 
            CB, 50(50 dahil) ile 60 arasında ise 
            CC, 40(40 dahil) ile 50 arasında ise 
            DC, 30(30 dahil) ile 40 arasında ise 
            DD, 30 'dan düşük ise FF  gelmeli.
            
         */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Vize sinav sonucunu giriniz:");
		double vize = scan.nextDouble();
	
		System.out.print("Vize sinavi yuzdesini giriniz:");
		double vizeYuzdesi = scan.nextDouble();
		
		System.out.print("Final sinav sonucunu giriniz:");
		double fnl = scan.nextDouble();
	
		System.out.print("Final sinavi yuzdesini giriniz:");
		double fnlYuzdesi = scan.nextDouble();
		
		double ortalama = (vize*vizeYuzdesi/100) + (fnl*fnlYuzdesi/100);
		
		System.out.println("ortalamaniz: " + ortalama);
		
		if (ortalama>=90) {
			System.out.println("gecme notunuz: AA" );
	}
		else if (ortalama>=80) {
			System.out.println("gecme notunuz: BA" );
	}
		else if (ortalama>=70) {
				System.out.println("gecme notunuz: BB" );
		
	}
		else if (ortalama>=60) {
				System.out.println("gecme notunuz: CB" );
	}
	
		else if (ortalama>=50) {
			System.out.println("gecme notunuz CC" );
	}
		else if (ortalama>=40) {
			System.out.println("gecme notunuz DC" );
	}
		else if (ortalama>=30) {
			System.out.println("gecme notunuz DD" );
			
	}		else {
				System.out.println("Agam niddinsen ya gecme notunuz FF ");
			}

}
}
