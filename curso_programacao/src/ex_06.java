import java.util.Scanner;
import java.util.Locale;

public class ex_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		double a,b,c, triangulo, circulo, trap, quadrado, retangulo, pi = 3.14159 ;
		
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		
		triangulo = (a*c)/2;
		circulo  =  (pi*(Math.pow(c, 2.0)));
		trap = a*b*c;
		quadrado = Math.pow(b, 2.0);
		retangulo = a*b;
		
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trap);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		
		scan.close();

	}

}
