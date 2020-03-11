import java.util.Scanner;

public class dec_02 {
	public static void main (String [] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int x;
		
		x = scan.nextInt();
		
		if ((double)x%2== 0) {
			
			System.out.println("o numero é par!");
			
		}else {
			
			System.out.println("o número é impar!");
		}
		scan.close();
	}
}
