package application;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		
		list.add("Maria");
		list.add("Alex");
		list.add("bob");
		list.add("Bindra");
		list.add(2, "Marco");
		
		
		
		System.out.println(list.size());
		for (String x: list) {
			System.out.println(x);
			
		}
		System.out.println("------------------------------");
		
		
		System.out.println(list.size());
		System.out.println("-------------------------");
		for (String x: list) {
			System.out.println("index: " + list.indexOf(x));
			System.out.println(x);
		}
		System.out.println("------------------------------");
		
		list.removeIf( x -> x.charAt(0) == 'M');
		System.out.println(list.size());
		for (String x: list) {
			System.out.println(x);
			}
		System.out.println("------------------------------");
		List<String> result = list.stream().filter (x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x: result) {
			System.out.println(x);
			}
		System.out.println("------------------------------");
		
		String name = list.stream().filter(x -> x.charAt(0) == 'J').findFirst().orElse(null);
		System.out.println(name);
		
	}

}
