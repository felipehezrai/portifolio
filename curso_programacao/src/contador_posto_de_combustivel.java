import java.util.Scanner;

public class contador_posto_de_combustivel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int cont, gasolina = 0, alcool = 0, diesel = 0;
		
		cont = scan.nextInt();
		
		while (cont != 4) {
			
			cont = scan.nextInt();
			
			if (cont ==1) {
				gasolina++;
			}else if (cont ==2) {
				alcool++;
			}else if (cont ==3) {
				diesel++;
			}
			
		}
		System.out.println("MUITO OBRIGADO!");
		System.out.println("GASOLINA: " + gasolina);
		System.out.println("ALCOOL: " + alcool);
		System.out.println("DIESEL: " + diesel);
		
		scan.close();
	}
	
}
