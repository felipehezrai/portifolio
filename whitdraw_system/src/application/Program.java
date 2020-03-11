package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account = new Account(0, null);
		
		System.out.print("Enter account number: ");
		int accountNumber= sc.nextInt();;
		account.setAccountNumber(accountNumber);
		
		
		
		System.out.print("Enter holder name: ");
		sc.nextLine();
		String holderName = sc.nextLine();
		account.setHolderName(holderName);
		
		
		System.out.print("Enter initial deposit value? (y/n): ");
		char test = sc.next().charAt(0);
		
		if (test =='y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account.setInitialDeposit(initialDeposit);
			account = new Account(account.getAccountNumber(),account.getHolderName(), account.getInitialDeposit());
			
		}else {
			 account = new Account(account.getAccountNumber(), account.getHolderName());
			System.out.println(account);
			
		}
		
		
		
		sc.close();
	}

}
