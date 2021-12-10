package Replit;

public class replit_Array_StringSayiTopla {

	public static void main(String[] args) {
		
		 String krk = "ade1r4d3";
			String sum []=krk.split("");
			
			method(sum);
			
	}

	private static void method(String[] sum) {
		int toplam= 0;
		for (int i = 0; i < sum.length; i++) {
			if (Character.isDigit(sum[i].charAt(0))) {
				toplam+=Integer.valueOf(sum[i]);
			}
		}
		
			
		System.out.println(toplam);
			
		
	}

}
