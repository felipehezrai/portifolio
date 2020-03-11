package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		Student student = new Student();
		
		System.out.println("Enter student name: ");
		student.name = sc.nextLine();
		
		System.out.println("Enter Note 1");
		student.n1 = sc.nextDouble();
		
		System.out.println("Enter Note 2");
		student.n2 = sc.nextDouble();
		
		System.out.println("Enter Note 3");
		student.n3 = sc.nextDouble();
		
		System.out.println(student);
		
		if(student.Media()>60.0) {
			System.out.println("Pass!");
		}else {
			double media = student.Media();
			student.Missing(media);
			System.out.println("Failed!");
			System.out.println("Missing: " + media);
		}
		
		sc.close();
	}

}
