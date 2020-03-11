package entities;

public class Account {
	private int accountNumber =0;
	private String holderName ="";
	private double initialDeposit = 0.00;
	
	public Account() {
		
	};
	
	public Account(int accountNumber, String holderName, double initialDeposit) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
		this.initialDeposit = initialDeposit;
	}
	public Account(int accountNumber, String holderName) {
		super();
		this.accountNumber = accountNumber;
		this.holderName = holderName;
	}

	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getInitialDeposit() {
		return initialDeposit;
	}
	public void setInitialDeposit(double initialDeposit) {
		this.initialDeposit = initialDeposit;
	}
	
	@Override
	public String toString() {
		return "Account: " + accountNumber + 
				", " + "Holder: " + holderName
				+", $" + initialDeposit;
		
	}
	
}
