package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		
		System.out.print("Enter lines number: ");
		int n = s.nextInt();
		
		System.out.print("Enter colluns number: ");
		int m = s.nextInt();
		
		int mat[][] = new int[n][m];
		
		System.out.println("Enter the line values: ");
		
		for (int i =0; i<mat.length; i++) {
			for (int j=0;j<mat[i].length;j++) {
				mat[i][j]= s.nextInt();
			}
		}
			
		System.out.print("Search for the number:");
		int b = s.nextInt();
		
		for (int i =0; i<mat.length; i++) {
			for (int j=0;j<mat[i].length;j++) {
				if (b == mat[i][j]) {
					System.out.println("Position " + i + "," + j + ":");

					if (j > 0) {

						System.out.println("Left: " + mat[i][j-1]);

					}

					if (i > 0) {

						System.out.println("Up: " + mat[i-1][j]);

					}

					if (j < mat[i].length-1) {

						System.out.println("Right: " + mat[i][j+1]);

					}

					if (i < mat.length-1) {

						System.out.println("Down: " + mat[i+1][j]);

					}
				}
			}
		}
		
		s.close();
	}

}
