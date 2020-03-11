import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double priece1 = 2100.0;
		double priece2 =  650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%s, which the price is $%.2f%n%s, which price is $%.2f%nRecord: %d yars old code %d and gender: %c%n", product1, priece1, product2, priece2, age, code, gender);
	}

}
