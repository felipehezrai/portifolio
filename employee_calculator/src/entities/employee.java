package entities;

public class employee {
	public String name;
	public double gross_salary;
	public double tax;
	
	public double NetSalary() {
		double netSalary = gross_salary - tax;
		return netSalary;
	}
	
	public String toString() {
		return
		name + 
		"," +
		" $" +
		String.format("%.2f",NetSalary());
		
	}
	public void IncressSalary(double percentage) {
		
		gross_salary += gross_salary * percentage / 100.0;
				
	}
	
	
}
