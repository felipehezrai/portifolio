package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Radius;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter radius: ");
		
		Radius radius = new Radius();
		
		radius.r = sc.nextDouble();
		
		System.out.printf("Circunference: %.2f%n", radius.Circunference());
		System.out.printf("Volume: %.2f%n", radius.Volume());
		System.out.printf("Pi: %.2f%n", radius.P);	
		
		sc.close();
	}

}
