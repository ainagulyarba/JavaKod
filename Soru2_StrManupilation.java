package ainagulOdev1;

public class Soru2_StrManupilation {

	public static void main(String[] args) {

		// Soru 2) String seklinde verilen asagidaki fiyatlarin toplamini bulunuz
		// String str1 = “$13.99”
		// String str2 = “$10.55”
		// ipucu : Double.parseDouble() methodunu kullanabilirsiniz.

		
		String fiyat1 = "$13.99";
		String fiyat2 = "$10.55";
		String fiyat3 = "13";
		String fiyat4 = "10";
		
		fiyat1 =fiyat1.replace("$","");
		fiyat2 = fiyat2.replace("$", "");
		
		Double sayi1 = Double.parseDouble(fiyat1);
		Double sayi2 = Double.parseDouble(fiyat2);
		System.out.println(sayi1+sayi2);
		Integer sayi3 =Integer.parseInt(fiyat3);
		Integer sayi4 =Integer.parseInt(fiyat4);
		System.out.println(sayi3+sayi4);
		
		
		
		
		
		
	}

}
