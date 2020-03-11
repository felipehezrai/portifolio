import java.util.Scanner;
import java.util.Locale;

public class entradaDeDados {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x;
		int y;
		String z;
		
		y= sc.nextInt();
		x= sc.nextDouble();
		sc.next();
		z= sc.nextLine();
		
		System.out.println("dados digitados: ");
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		
		
		sc.close();
	}

}
