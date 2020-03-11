package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
			
	public static void main(String[] args) {
			Locale.setDefault(Locale.US);
			Scanner s = new Scanner(System.in);
			
			int n = s.nextInt();
			
			Product[] vect = new Product[n];
			
			for (int i =0; i<n; i++) {
				s.nextLine();
				String name = s.nextLine();
				double price =s.nextDouble();
				vect[i] = new Product(name, price);
			}
			
			double sum = 0.0;
			for (int i=0;i<n;i++) {
				sum += vect[i].getPrice();
			}
			double avg = sum/n;
			
			System.out.printf("Avarage price: %.2f", avg);
			
			
			s.close();
		}
}
