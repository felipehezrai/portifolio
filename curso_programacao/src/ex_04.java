import java.util.Scanner;
import java.util.Locale;

public class ex_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		int cod, hora;
		double salario, valHora;
		
		cod = scan.nextInt();
		hora = scan.nextInt();
		valHora = scan.nextDouble();
		
		salario = hora*valHora;
		
		System.out.printf("NUMBER: %d%nSALARY = U$ %.2f%n", cod, salario);
		scan.close();
	}

}
