package ainagulOdev1;

import java.util.Scanner;

public class IfElse_Frankfurt {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM  ---  Koln : 80 KM ---  (20 KM basina 5 euro bilet parasi alinmaktadir..) ");
		String rota = scan.next().toUpperCase();
		System.out.println("Rota = " + rota);
		
		System.out.println("Kac kisilik bilet istiyorsunuz? (Max 2 kisilik olabilir):   ");		
		int kisisayisi = scan.nextInt();
    	
		int FrankfurtKm = 60;
		int KolnKm = 80;
		int KmBirimFiyat = 5;
		
		switch (rota) {
		case "FRANKFURT":			
			switch (kisisayisi) {
			case 1:
				System.out.println("1 kisilik bilet fiyati, Frankfurt " + (FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				
				System.out.println("Bakiyeniz kac : ");
				double bakiye = scan.nextDouble();
				
				if (bakiye >= (FrankfurtKm/20*KmBirimFiyat*kisisayisi)) {
					System.out.println("Paraustu " + (bakiye - FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
			
				} else {
					System.out.println("Bakiye yetersiz! " + (bakiye - FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				}
				
				break;
			case 2:
				System.out.println("2 kisilik bilet fiyati, Frankfurt " + (FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");

				System.out.println("Bakiyeniz kac : ");
				bakiye = scan.nextDouble();
				
				if (bakiye >= (FrankfurtKm/20*KmBirimFiyat*kisisayisi)) {
					System.out.println("Paraustu " + (bakiye - FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				} else {
					System.out.println("Bakiye yetersiz! " + (bakiye - FrankfurtKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				}
				
				break;
			default:
				System.out.println("Gecerli kisi sayisi giriniz !");
				break;
			}
			break;
			
		case "KOLN":
			
			switch (kisisayisi) {
			case 1:
				System.out.println("1 kisilik bilet fiyati, Koln " + (KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				System.out.println("Bakiyeniz kac : ");
				double bakiye = scan.nextDouble();
				
				if (bakiye >= (KolnKm/20*KmBirimFiyat*kisisayisi)) {
					System.out.println("Paraustu " + (bakiye - KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				} else {
					System.out.println("Bakiye yetersiz! " + (bakiye - KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				}
				
				break;
			case 2:
				System.out.println("2 kisilik bilet fiyati, Koln " + (KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				System.out.println("Bakiyeniz kac : ");
				bakiye = scan.nextDouble();
				
				if (bakiye >= (KolnKm/20*KmBirimFiyat*kisisayisi)) {
					System.out.println("Paraustu " + (bakiye - KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				} else {
					System.out.println("Bakiye yetersiz! " + (bakiye - KolnKm/20*KmBirimFiyat*kisisayisi) + " Euro.");
				}
				
				break;
			default:
				System.out.println("Gecerli kisi sayisi giriniz !");
				break;
			}
			break;
		default:
			System.out.println("Gecerli sehir ismi giriniz !");
			break;
		
	}
		scan.close();
    	
    }
	}


