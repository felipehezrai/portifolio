package entities;

public class Account {
	private int accountNumber = 0;
	private String holder = "";
	private double balance = 0;
	
	public Account() {
	}
	
	public Account(int accountNumber, String holder) {
		super();
		this.accountNumber = accountNumber;
		this.holder = holder;
	}
	
	public Account(int accountNumber, String holder, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.holder = holder;
		deposit(initialDeposit);
	}
	
	public void deposit (double quantity) {
		balance+=quantity;
	}
	
	public void withdraw (double quantity) {
		balance-=quantity+5;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public double getBalance() {
		return balance;
	}

	@Override
	public String toString() {
		return "Account " +
				accountNumber + 
				", Holder: "+
				holder + 
				", Balance: $ " +
				getBalance();
	}
}