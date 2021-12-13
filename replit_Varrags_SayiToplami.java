package Replit;

public class replit_Varrags_SayiToplami {

	public static void main(String[] args) {
		// Write a return method that accepts more than one integer as parameter 
		// and prints the sum of integers Method name = sum if you call method like 
		// that sum(1,2,3) output=6; sum(1,2,3,4,5) output = 15 ; sum(1,2) output=3
	

	
	System.out.println(sum(1,2,3));
	System.out.println(sum(1,2,3,4,5));
	System.out.println(sum(1,2));
	
	}

	private static int sum(int...sayilar) {
		
		int sum =0;
		
		for (int each : sayilar) {
			
			sum+=each;
			
		}
		
		return sum;
	}

}
