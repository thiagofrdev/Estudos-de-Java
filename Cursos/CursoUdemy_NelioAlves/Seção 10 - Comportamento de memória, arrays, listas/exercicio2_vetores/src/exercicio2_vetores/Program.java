/*
 * Faça um programa que leia N números reais e armazene-os 
 * em um vetor. Em seguida:
 * - Imprimir todos os elementos do vetor
 * - Mostrar na tela a soma e a média dos elementos do 
 * vetor 
 */

package exercicio2_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a quantity: ");
		int size = scan.nextInt();

		double[] vet = new double[size];
		double sum = 0.0;
		double average = 0.0;
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter a number: ");
			vet[i] = scan.nextInt();
			sum += vet[i];
		}
		
		average = sum/vet.length;
				
		System.out.print("\nValues: ");
		for(int i = 0; i < vet.length; i++) {
			System.out.print(vet[i] + "  ");
		}
		System.out.printf("\nTotal sum: %.2f\nAverage: %.2f", sum, average);
		
		scan.close();
	}

}
