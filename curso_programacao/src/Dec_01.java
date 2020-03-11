import java.util.Scanner;

public class Dec_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int x;
		
		x = scan.nextInt();
		
		if (x<0) {
			
			System.out.println("o número é negativo");
		}else {
			
			System.out.println("o número é positivo");
		}
		
		scan.close();
	}

}
