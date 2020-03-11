import java.util.Scanner;
import java.util.Locale;

public class dec_05 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		int x,y;
		double conv = 0, result;
		System.out.println("digite o codigo do protudo");
		x = scan.nextInt();
		System.out.println("digite a quantidade");
		y = scan.nextInt();
		
		if (x==1) {
			conv = 4.00;
		}if (x==2) {
			conv = 4.50;
		}if(x==3) {
			conv = 5.00;
		}if (x==4){
			conv = 2.00;
		}if(x==5) {
			conv = 1.50;
		}
		
		result = conv * y;
		
		System.out.println("o total e de: " + result);
		scan.close();
	}

}
