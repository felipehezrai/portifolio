package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		System.out.println("What is the dollar price?: ");
		double dollarp = sc.nextDouble();
		
		System.out.println("How many dollar will be bougth?");
		double dollarq = sc.nextDouble();
		
		System.out.println("Amount to paid in reais: " + CurrencyConverter.Calculator(dollarp,dollarq));
		
		sc.close();
	}

}
