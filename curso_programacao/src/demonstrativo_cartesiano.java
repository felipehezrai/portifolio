import java.util.Scanner;

public class demonstrativo_cartesiano {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int x = scan.nextInt();
		int y = scan.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0 && y > 0) {
				System.out.println("primeiro");
			}
			else if (x < 0 && y > 0) {
				System.out.println("segundo");
			}
			else if (x < 0 && y < 0) {
				System.out.println("terceiro");
			}
			else {
				System.out.println("quarto");
			}
			x = scan.nextInt();
			y = scan.nextInt();
		}
		
		scan.close();
	}
}
