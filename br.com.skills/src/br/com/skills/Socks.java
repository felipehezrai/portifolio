package br.com.skills;

import java.util.Scanner;

public class Socks {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tamanho = 0, n = 0;
		System.out.println("Informe o tamanho do vetor");
		tamanho = input.nextInt();
		
		int arg[] = new int[tamanho];
		
		for(int i = 0; i < tamanho; ++i) {
			n = input.nextInt();
			arg[i] = n;
		}
		
		contaPares(arg);
		
		input.close();

	}
	
	static void contaPares(int arg[]) {
		int result = 0, pares[] = new int[arg.length], posicoesPares[] = new int[arg.length];
		int contador = 0;
		int count = 0;

		
		//carrega vertor arg com -1 pra nao exibir tudo com 0.
		for (int z=0; z<arg.length;z++) {
			
			posicoesPares[z]=-1;
		}
		
		for(int i = 0 ; i < arg.length-1 ; ++i) {
			
			
			for(int j = 0 ; j < arg.length -1 ;j++  ) {
			
				
				if(arg[i] == arg[j+1]) {
					posicoesPares[count] = i;
					posicoesPares[++count] = j;
					
					//10 20 10
					++contador;
					
					
				}
					
				if(contador%2==0) {
					result++;
				}
				
			} // fim for 2
		
			
			
			
		}// fim for 1
		for(int x = 0;   x < posicoesPares.length; ++x) {
			System.out.println("posicoes" + posicoesPares[x]);
		}
		
		
		System.out.println("result: " + result);
		
	}

}
