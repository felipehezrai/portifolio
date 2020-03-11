package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int n = s.nextInt();
		
		int mat[][] = new int[n][n];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0;j<mat[i].length;j++) {
				mat[i][j]= s.nextInt();
			}
		}
		
		System.out.println("Main diagonal");
		for (int i =0; i<n; i++) {
			System.out.println(mat[i][i]);
		}
		
		int cont = 0;
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0;j<mat[i].length;j++) {
				if (mat[i][j]<0) {
					cont++;
				}
			}
		}
		System.out.println("negative numbers");
		System.out.println(cont);
		
		s.close();
	}

}
