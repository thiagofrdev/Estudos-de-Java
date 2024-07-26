/*
 * d) Ler 15 elementos de uma matriz tipo vetor. Construir uma matriz B de mesmo
 * tipo, observando a seguintes lei de formação: “Todo elemento de B deverá ser 
 * o quadrado do elemento de A correspondente”. Apresentar as matrizes A e B.
 */

package exercicio04_vetores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[15];
		int[] B = new int[15];
		
		for(int i = 0; i<15; i++) {
			System.out.printf("Insira o %dº valor de A: ", i+1);
			A[i] = scan.nextInt();
			B[i] = (int) Math.pow(A[i], 2);//Casting para indicar que os valores trabalhados serão inteiros. O Math.pow recebe e retorna valores double
		}
		
		System.out.println("\nValores de A:");
		for(int num : A) {
			System.out.printf("[%d] ", num);
		}
		
		System.out.println("\nValores de B:");
		for(int num : B) {
			System.out.printf("[%d] ", num);
		}
		
		scan.close();
	}

}
