import java.util.Scanner;

public class senha_while {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		
		int x;
		
		x = scan.nextInt();
		
		while (x != 2002) {
			
			System.out.println("senha incorreta");
			x = scan.nextInt();
		}
		System.out.println("Senha correta");
		scan.close();
	}

}
