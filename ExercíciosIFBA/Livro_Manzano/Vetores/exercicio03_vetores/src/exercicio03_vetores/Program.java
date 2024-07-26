/*
 * c) Ler duas matrizes A e B do tipo vetor com 20 elementos. Construir uma matriz
 * C, onde cada elemento de C é a subtração do elemento correspondente de A com B.
 * Apresentar a matriz C.
 */

package exercicio03_vetores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[20];
		int[] B = new int[20];
		int[] C = new int[20];
		
		for(int i = 0; i<20; i++) {
			System.out.printf("Digite o %dº valor de A: ", i+1);
			A[i] = scan.nextInt();
		}
		
		System.out.println();
		for(int i = 0; i<20; i++) {
			System.out.printf("Digite o %dº valor de B: ", i+1);
			B[i] = scan.nextInt();
			C[i] = A[i] - B[i];
		}
		
		System.out.println("\nOs valores de C são: ");
		for(int num : C) {
			System.out.printf("[%d] ", num);
		}
		
		scan.close();
	}

}
