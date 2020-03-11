package application;

import java.util.Locale;
import java.util.Scanner;

import entities.employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		employee employee = new employee();
		
		System.out.println("Enter employee name:");
		employee.name = sc.nextLine();
		
		System.out.println("Enter salary: ");
		employee.gross_salary = sc.nextDouble();
		

		System.out.println("Enter tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println("Employee" + employee);
		
		System.out.println("Which percentage to increase salary: ");
		double percentage =sc.nextDouble();
		employee.IncressSalary(percentage);
		
		System.out.println("Update Data: " + employee);
		sc.close();
	}

}
