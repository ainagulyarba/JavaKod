package interviewPrep;

public class Q13 {
	public static void main(String[] args) {
		/*
		 * Write a Java Program to swap two numbers
		 * Swap (takas) islemini --> a=3, b=5 iken a=5, b=3 degerlerini alması
		 * islemidir. iki yoldan yaptiginiz java kodunu yaziniz. 1.Yol: 3. degisken
		 * kullanarak 2.Yol: 3. degisken kullanmadan
		 */

		int a =3;
		int b=5;
		int x=b;
		b=a;
		a=x;
		System.out.println("===========1.Yol==========");
		System.out.println("a="+a+"\nb="+b);
		
		int a1 =3;
		int b1 =5;//a1=5 b1=3
		a1=a1+b1;//8
		b1=a1-b1;//3
		a1=a1-b1;//5
		
		System.out.println("===========2.Yol==========");
		System.out.println("a="+a1+"\nb="+b1);
		
		
		
		
		
		
	}
}
