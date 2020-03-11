package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rent;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner (System.in);
		
		System.out.print("How many room will be rented? ");
		int n = s.nextInt();
		
		Rent [] vect = new Rent[10];
		
		for (int i = 0; i<n; i++) {
			
			s.nextLine();
			System.out.println("Rent #" + (i+1));
			
			System.out.print("Name: ");
			String name = s.nextLine();
			
			System.out.print("Email:");
			String email = s.nextLine();
			
			System.out.print("Room: ");
			int room = s.nextInt();
			
			vect[room] = new Rent(name, email);
				
		}
		System.out.println("BUSY ROOMS:");
		
		for (int i = 0 ; i<vect.length; i++) {
			if (vect[i] != null) {
			System.out.println( i + ": " + vect[i]);
			}
		}
	}
}


