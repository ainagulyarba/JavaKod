package Replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class replit_list4 {

	public static void main(String[] args) {
		/*
		 * Write a program that deletes the letters 'a' from the names in the list given
		 * as input.
		 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
		 * OUTPUT :
		 * [Veli,Omer]
		 */
		
		List <String> str = new ArrayList<>();
		
		str.add("Ali");
		str.add("Veli");
		str.add("Ayse");
		str.add("Fatma");
		str.add("Omer");
		
		
		String silinecekHarf = "A";
		String silinecekHarf1= "a";
		
		for (int i = 0; i <str.size(); i++) {
			
			if (str.get(i).contains(silinecekHarf) || str.get(i).contains(silinecekHarf1)) {
				str.remove(i);
				i--;
	
			}	
		
		
	}
		System.out.println(str);
	}
	}
