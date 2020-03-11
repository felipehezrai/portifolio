package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		Account account;
		
		System.out.print("Enter Account number: ");
		int number =s.nextInt();
		System.out.print("Enter Holder Name: ");
		s.nextLine(); 
		String holder =s.nextLine();
		
		System.out.print("Is there an initial value?(y/n)");
		char response = s.next().charAt(0);
		
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit =s.nextDouble();
			account = new Account (number, holder, initialDeposit);
		}else {
			
			account = new Account (number, holder);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.print(account);
		System.out.println();
		
		System.out.print("Enter deposit value: ");
		double depositValue = s.nextDouble();
		account.deposit(depositValue);
		
		System.out.println("Account Data Update:");
		System.out.print(account);
		System.out.println();
		
		System.out.print("Enter withdraw value: ");
		double withdraw =s.nextDouble();
		account.withdraw(withdraw);
		
		System.out.println("Account Data Update:");
		System.out.print(account);		
		
		s.close();
	}

}
