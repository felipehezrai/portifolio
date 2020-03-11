import java.util.Scanner;

public class ex_01 {
	
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int n1,n2, soma;
		
		n1 =scan.nextInt();
		n2 =scan.nextInt();
		
		soma = n1+n2;
		
		System.out.println("o valor da soma dos numeros inseridos é: " + soma);
		
		scan.close();
	}

}
