package Replit;

public class replit_List5_AsalSayi {

	public static void main(String[] args) {
		/*
         *100 den kucuk asal sayilari yazdiran bir program yaziniz
         */
        
        int flag = 0;
        
        for (int i = 6; i < 42; i++) {
            flag = 0;
           
            for (int j = 2; j < i; j++) {
                if (i%j == 0) {
                    flag = 1;
                    break;
                } 
            }
            
            if ( i> 1 && flag == 0) {
                System.out.print(i + " ");

	}
            }
        
	}

}
