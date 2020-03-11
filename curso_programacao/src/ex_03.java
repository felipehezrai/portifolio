import java.util.Scanner;

public class ex_03 {

	public static void main(String[] args) {
		Scanner oqueeuquiser = new Scanner(System.in);
		
		int a,b,c,d, diferenca;
		
		a = oqueeuquiser.nextInt();
		b = oqueeuquiser.nextInt();
		c = oqueeuquiser.nextInt();
		d = oqueeuquiser.nextInt();
		
		diferenca = (a*b) - (c*d);
		
		System.out.println("a diferença dos produtos é: " + diferenca);
		oqueeuquiser.close();
		

	}

}
