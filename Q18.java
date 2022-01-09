package interviewPrep;

public class Q18 {
    public static void main(String[] args) {
        /*
 Ask user to enter the number of lines of a  pyramid .
 Type a program to create the pyramid.
 For example if the number of lines is 5, the pyramid will be like;
             *
            * *
           * * *
          * * * *
         * * * * *


 Kullanıcının  girdigi satır sayısı kadar * ile piramid sekli yazdıran bir program create ediniz.
         */
    	
    	for (int i=1; i<=5; i++) {
			for(int j=5; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++) {
				System.out.print("*");
				System.out.print(" ");
			}
		System.out.println();
		}	
    	}
    }

