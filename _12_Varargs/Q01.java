package _12_Varargs;

public class Q01 {
	public static void main(String[] args) {
		//  verilen Stringleri birlestiren concat isimli bir method olusturunuz
		// input : "m", "e", "r", "v", "e";
		// output : merve

		birlestir("m","e","r","v","e");
		birlestir("a","i","n","a","g","u","l");
			
	}

	
	private static void birlestir(String ...str) {
		
		String yeniStr="";
		
		for (String each : str) {
			yeniStr=yeniStr.concat(each);
			
		}
		
		System.out.println(yeniStr);
	}

}
