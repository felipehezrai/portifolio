package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		String name = sc.nextLine();
		
		System.out.println("Price: ");
		double price = sc.nextDouble();
		
	
		System.out.println();
		
		Product product = new Product(name, price);
		
		System.out.println ("Product data: " + product);
		System.out.println();
		
		System.out.println("enter the number of products to added in stok");
		int quantity = sc.nextInt();
		product.addProduct(quantity);
		
		System.out.println();
		System.out.println ("Product data: " + product);
		
		System.out.println();
		System.out.println("enter the number of products to removed in stok");
		quantity = sc.nextInt();
		product.removeProduct(quantity);
		
		System.out.println();
		System.out.println ("Product data: " + product);
		
		
		
		sc.close();

	}

}
