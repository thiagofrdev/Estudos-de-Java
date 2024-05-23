/*
 * Faça um programa que leia um número inteiro positivo 
 * N (máximo = 10) e depois N números inteiros e 
 * armazene-os em um vetor. Em seguida, mostrar na tela 
 * todos os números negativos lidos. 

 */

package application;

import java.util.Scanner;
import java.util.Locale;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Type a number (Max. 10): ");
		int size = sc.nextInt();
		int[] vet = new int[size];
		
		for(int i = 0; i < vet.length; i++) {
			System.out.printf("Enter number %d: ", i);
			int num = sc.nextInt();
			vet[i] = num;
		}
		
		System.out.println("NEGATIVE NUMBERS:");
		for(int i = 0; i < vet.length; i++) {
			if(vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
	}

}
