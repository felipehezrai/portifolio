package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner s = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		
		int n = s.nextInt();
		
		for (int i=0;i<n;i++) {
			System.out.println();
			System.out.println("Employee #" + i + ": ");
			System.out.print("Id: ");
			int id = s.nextInt();
			System.out.print("Name: ");
			s.nextLine();
			String name = s.nextLine();
			System.out.print("Salary: ");
			double salary = s.nextDouble();
			list.add(new Employee(id, name, salary));
		}
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int id = s.nextInt();
		Employee emp = list.stream().filter(x -> x.getId()==id).findFirst().orElse(null);
		if(emp==null) {
			System.out.println("This id does not exist!");
		}else {
			System.out.print("Enter the percentage: ");
			double percentage = s.nextDouble();
			emp.inscreaseSalary(percentage);
		}
		System.out.println();
		System.out.println("List of employees:");
		for (Employee obj: list) {
			System.out.println(obj);
		}
		s.close();
	}
}
