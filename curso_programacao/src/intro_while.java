import java.util.Locale;
import java.util.Scanner;

public class intro_while {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner (System.in);
		
		 int x, res=0;
		 
		 x = scan.nextInt();
		
		 while (x !=0) {
			res += x;
			x = scan.nextInt();		
		}
		System.out.println(res);
		scan.close();
	}
	
}
