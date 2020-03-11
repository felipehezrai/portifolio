package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static final double P = 3.14159;
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter Radius: ");
		double radius = sc.nextDouble();
		
		double c = circunference(radius);
		
		double v = volume(radius);
		
		System.out.printf("Circunference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("Pi: %.2f%n", P);
		
		sc.close();
	}
	
	public static double circunference(double radius){
		return 2*P*radius;
		
	}
	
	public static double volume(double radius) {
		return 4.0 * P * (radius * radius * radius)/3.0;
	}

}
