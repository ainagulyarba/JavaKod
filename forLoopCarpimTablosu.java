package ainagulOdev1;
import java.util.Scanner;

import ainagulOdev1.Switch_Case;

public class forLoopCarpimTablosu {

	

	public static void main(String[] args) {
		
		
		// 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuaridaki carpim tablosunu 10 a kadar ekrana yazdiriniz.
  
		
		
		for (int i =1; i <= 10; i++) {
			
    		for (int j = 1; j <= 5; j++) {
				
    			System.out.print(j + "x" + i + "=" + (j*i)+"   ");
			}
    		
    		System.out.println();
		}	
		
		
		
	}

}
