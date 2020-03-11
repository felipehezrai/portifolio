import java.util.Scanner;


public class dec_03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int x,y;
		
		x = scan.nextInt();
		y = scan.nextInt();
		double result;
		
		if (y>x) {
			result =(double)y%(double)x;
		}else {
			result = (double)x%(double)y;
		}
		
		
		if(result==0) {
			System.out.println("são multiplos");
		}else {
			
			System.out.println("não são multiplos");
		}
			
			scan.close();
			
		
		
	}

}
