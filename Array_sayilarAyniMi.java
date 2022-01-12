package odev_Array;

public class Array_sayilarAyniMi {

	public static void main(String[] args) {
		
		//dizinizin ilk ve son elemanlarin ayni olup olmadigini kontrol eden kod yaziniz
		
	
		int arr[]= {2,6,4,8,2,6,2};
		
		if (arr[0]==arr[arr.length-1]) {
			
			System.out.println("true");
		
		} else {
			
			System.out.println("false");
		
		}

	}

}
