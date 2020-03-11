package application;

import java.util.Locale;
import java.util.Scanner;

public class ArraysExemple {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the number of peoples: ");
		int n = s.nextInt();
		
		double [] vect = new double[n];

		for (int i=0; i<n;i++) {
			vect[i] =s.nextDouble();
		}
		
		for (int i=0; i<n;i++) {
			System.out.println(vect[i]);
		}
		double soma =0.0;
		
		for (int i =0; i<n;i++) {
			soma += vect[i]/n;
		}
		
		System.out.println(soma);
		
		s.close();
	}

}
