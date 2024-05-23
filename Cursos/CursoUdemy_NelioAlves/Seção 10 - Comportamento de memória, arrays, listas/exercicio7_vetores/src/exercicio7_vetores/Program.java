/*
 * Fazer um programa para ler um número inteiro N e depois um vetor de N números 
 * reais. Em seguida, mostrar na tela a média aritmética de todos elementos com três 
 * casas decimais. Depois mostrar todos os elementos do vetor que estejam abaixo da 
 * média, com uma casa decimal cada.
 */

package exercicio7_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int size = scan.nextInt();
		
		double[] vector = new double[size];
		double average = 0.0;
		
		for(int i = 0; i < vector.length; i++) {
			System.out.print("Type a number: ");
			double num = scan.nextDouble();
			vector[i] = num;
			average += num;
		}
		
		average /= vector.length; 
		System.out.printf("Average: %.3f", average);
		System.out.println("\nUnder average elements:");
		for(int i = 0; i < vector.length; i++) {
			if(vector[i] < average) {
				System.out.print(vector[i] + "  ");
			}
		}
		
		scan.close();
	}

}
