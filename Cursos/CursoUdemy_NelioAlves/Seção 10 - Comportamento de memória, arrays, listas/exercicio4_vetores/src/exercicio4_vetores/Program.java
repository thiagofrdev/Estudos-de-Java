/*
 * Faça um programa que leia N números inteiros e armazene-os em um vetor. 
 * Em seguida, mostre na tela todos os números pares, e também a quantidade 
 * de números pares.
 */

package exercicio4_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a size: ");
		int size = scan.nextInt();
		
		int[] vet = new int[size];
		int qtdPair = 0;
		
		for(int i = 0; i < size; i++) {
			System.out.printf("Enter the %dº number: ", i+1);
			int num = scan.nextInt();
			if(num%2==0) {
				qtdPair++;
			}
			vet[i] = num;
		}
		
		System.out.println("\nPair numbers:");
		for(int i = 0; i < size; i++) {
			if(vet[i]%2==0) {
				System.out.print(vet[i] + "  ");
			}
		}
		System.out.println("\n\nQuantity of pairs: " + qtdPair);
 
		scan.close();
	}

}
