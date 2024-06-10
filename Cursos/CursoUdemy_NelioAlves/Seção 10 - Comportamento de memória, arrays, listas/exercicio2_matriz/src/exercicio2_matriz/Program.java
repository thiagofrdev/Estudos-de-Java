package exercicio2_matriz;

import java.util.Scanner;
import java.util.Locale;
import java.util.Random;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("Type a number of lines: ");
		int m = scan.nextInt();
		System.out.print("Type a number of columns: ");
		int n = scan.nextInt();
		
		int[][] matriz = new int[m][n];
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				matriz[i][j] = rand.nextInt(20);
			}
		}
		
		System.out.print("\nMatriz: ");
		for(int i = 0; i < matriz.length; i++) {
			System.out.println("");
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j] + "\t");
			}
		}
		
		System.out.print("\n\nEnter a number: ");
		int num = scan.nextInt();
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(num == matriz[i][j]) {
					System.out.printf("\nPosition [%d][%d]:\n", i, j);
					if(i-1 >= 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if(j+1 < matriz[i].length){
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if(i+1 < matriz.length) {
						System.out.println("Down: " + matriz[i+1][j]);
					}
					if(j-1 >= 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
				}
			}
		}
		
		scan.close();
	}

}
