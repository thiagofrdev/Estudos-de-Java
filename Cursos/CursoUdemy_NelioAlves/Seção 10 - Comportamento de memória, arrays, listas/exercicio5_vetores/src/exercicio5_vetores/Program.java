/*
 * Faça um programa que leia N números reais e armazene-os em um vetor. 
 * Em seguida, mostrar na tela o maior número do vetor (supor não haver empates).
 * Mostrar também a posição do maior elemento, considerando a primeira posição 
 * como 0 (zero).
 */

package exercicio5_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a size: ");
		int size = scan.nextInt();
		
		double[] vet = new double[size];
		double higher = 0.0;
		int pos = 0;
		
		for(int i = 0; i < size; i++) {
			System.out.print("Enter a number: ");
			double num = scan.nextDouble();
			vet[i] = num;
		}
		
		for(int i = 0; i < size; i++) {
			if (higher < vet[i]) {
				higher = vet[i];
				pos = i;
			}
		}
		
		System.out.println("Higher number: " + higher);
		System.out.println("Position: " + pos);
		
		scan.close();
	}
}
