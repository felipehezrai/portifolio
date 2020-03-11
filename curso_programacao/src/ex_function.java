import java.util.Scanner;

public class ex_function {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter three numbers: ");

		int a,c,b, higher;
		
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		
		higher = max(a,b,c);
		
		showResult(higher);
		
		sc.close();
	}
	
	public static int max(int x,int y, int z) {
		
		int aux;
		
		if (x>y && x>z) {
			
			aux = x;
		}else if(y>z){
			aux = y;
			}else {
				aux = z;
			}
		return aux;
	}
	
	public static void showResult(int value) {
		System.out.println("Higher = " + value);
		
	}

}
