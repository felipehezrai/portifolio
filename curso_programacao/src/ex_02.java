import java.util.Scanner;
import java.util.Locale;

public class ex_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		double raio,  pi, area;
		pi= 3.14159;
		
		raio = scan.nextDouble();
		
		area = pi*(Math.pow(raio, 2.0));
		
		System.out.printf("a area do circulo é de: %.4f%n ", area);
		scan.close();
	}

}
