import java.util.Scanner;
import java.util.Locale;

public class ex_05 {
	public static void main (String args[]) {
		
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		int cod1,cod2,quant1,quant2;
		double valuni1,valuni2,valtot;
		
		cod1 = scan.nextInt();
		quant1 = scan.nextInt();
		valuni1 = scan.nextDouble();
		
		cod2 = scan.nextInt();
		quant2 = scan.nextInt();
		valuni2 = scan.nextDouble();
		
		valtot = quant1*valuni1 + quant2+valuni2;
		
		System.out.printf("Valor a pagar: U$%.3f%n", valtot);
		scan.close();
	}
}
