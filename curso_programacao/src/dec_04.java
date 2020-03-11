import java.util.Scanner;
public class dec_04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int x,y, temp;
		
		System.out.println("digite a hora do inicio do jogo:");
		x = scan.nextInt();
		
		System.out.println("digite a hora do termino do jogo:");
		y = scan.nextInt();
		
		temp = y-x;
		
		if (temp<=0) {
			
			temp =temp + 24;
		}
		System.out.println("o jogo durou:" + temp +" Horas");
		
		
		scan.close();
		
	}

}
