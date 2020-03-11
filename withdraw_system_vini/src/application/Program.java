package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		Account account;
		
		System.out.print("Enter account number: ");
		int accountNumber = s.nextInt();
		
		System.out.print("Enter account holder: ");
		String holder = s.next();
		s.nextLine();
		
		System.out.print("Is there an initial deposit (y/n)? ");
		char test = s.next().charAt(0);
		
		if (test == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = s.nextDouble();
			account = new Account(accountNumber, holder, initialDeposit);
		} else {
			account = new Account(accountNumber, holder);
		}
		
		System.out.println("\nAccount data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a deposit value: ");
		double quantity = s.nextDouble();
		account.deposit(quantity);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		System.out.print("\nEnter a withdraw value: ");
		quantity = s.nextDouble();
		account.withdraw(quantity);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		
		s.close();
	}
}