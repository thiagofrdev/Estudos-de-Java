/*
 * Faça um programa para ler dois vetores A e B, contendo N elementos 
 * cada. Em seguida, gere um terceiro vetor C onde cada elemento de C 
 * é a soma dos elementos correspondentes de A e B. Imprima o vetor C 
 * gerado.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.VectorSum;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a size of vectors: ");
		int size = scan.nextInt();
		
		int[] vect1 = new int[size];
		int[] vect2 = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.printf("%dº number of vector A: ", i+1);
			int num = scan.nextInt();
			vect1[i] = num;
		}
		
		for(int i = 0; i < vect2.length; i++) {
			System.out.printf("%d number of vector B: ", i+1);
			int num = scan.nextInt();
			vect2[i] = num;
		}
		
		VectorSum vectorSum = new VectorSum(vect1, vect2);
		
		int[] vectorC = vectorSum.getVectorC();
		
		System.out.println("VECTOR C:");
		for(int i = 0; i < vectorC.length; i++) {
			System.out.print(vectorC[i] + "  ");
		}
				
		scan.close();
	}

}
