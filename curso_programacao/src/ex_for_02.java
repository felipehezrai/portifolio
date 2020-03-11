import  java.util.Scanner;

public class ex_for_02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		int n, x, in=0, out=0;
		
		
		n = scan.nextInt();
		
		for (int i=0; i<n;i++) {
			
			x = scan.nextInt();
			
			if (x>=10 && x<=20) {
				in++;
			}else {
				
				out++;
			}
		}
		System.out.println("in: "+ in);
		System.out.println("out: " + out);
		scan.close();
	}

}
