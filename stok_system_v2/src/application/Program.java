package application;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import entitites.Product;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		System.out.println("DIgite o nome do produto");
		String name = s.nextLine();
		
		System.out.println("Digite o pre�o do produto");
		double price = s.nextDouble();
		
		System.out.println("Quantidade");	
		int quantity = s.nextInt();
		
		Product pd = new Product(name, price, quantity);		
	
		
		
		
		s.close();
	}

}
