package application;

import java.util.Locale;
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner (System.in);
		
		int x = 20;
		
		Integer obj = x;
		
		System.out.println(obj);
		
		int y = obj*2;
		
		System.out.println(y);

		
		
		String vect[] = new String[] {"Maria", "João", "Felipe"};
		
		for (String obvect: vect) {
			System.out.println(obvect);
		}
	
	}

}
