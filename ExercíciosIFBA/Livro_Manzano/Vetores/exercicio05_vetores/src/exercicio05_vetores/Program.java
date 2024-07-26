/*
 * e) Ler duas matrizes A e B do tipo vetor com 15 elementos cada. Construir uma
 * matriz C, sendo esta a junção das duas outras matrizes. Desta forma, C deverá
 * ter o dobro de elementos, ou seja, 30. Apresentar a matriz C. 
 */

package exercicio05_vetores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[15];
		int[] B = new int[15];
		int[] C = new int[30];
		
		for(int i = 0; i<15; i++) {
			System.out.printf("Insira o %dº valor de A: ", i+1);
			A[i] = scan.nextInt();
		}
		
		System.out.println();
		for(int i = 0; i<15; i++) {
			System.out.printf("Insira o %dº valor de B: ", i+1);
			B[i] = scan.nextInt();
		}
		
		for(int i = 0; i<15; i++) {
			C[i] = A[i];
		}
		
		for(int i = 0; i<15; i++) {
			C[A.length+i] = B[i];
		}
		
		System.out.println("\nValores de C:");
		for(int num : C) {
			System.out.printf("[%d] ", num);
		}
		
		
		scan.close();
	}

}
