package entities;


public class Product {
	
	String name;
	private double price;
	private int quantity;
	
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = 0;
		
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
		
	}
	
	public double totalValueInStok() {
		double total = price* quantity;
		return total;
	}
	
	public void addProduct(int quantity) {
		this.quantity += quantity;
	}
	
	public void removeProduct(int quantity) {
		this.quantity -= quantity;
	}
	
	public String toString() {
			return name
			+ ", $"
			+ String.format("%.2f", price)
			+ ", "
			+ quantity
			+ " units, Total: $"
			+ String.format("%.2f",totalValueInStok());
		
	}
}
