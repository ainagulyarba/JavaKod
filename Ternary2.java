package ainagulOdev1;

public class Ternary2 {

	public static void main(String[] args) {
	
		int y = 1;
		int z = 1;
		int a = y<10 ? y++: z++;
		
		System.out.println(a);
		System.out.println(y);
	
	a = y<10 ? ++y : z++;
	System.out.println(a);
	System.out.println(y);
	
	
	
	
	}

}
