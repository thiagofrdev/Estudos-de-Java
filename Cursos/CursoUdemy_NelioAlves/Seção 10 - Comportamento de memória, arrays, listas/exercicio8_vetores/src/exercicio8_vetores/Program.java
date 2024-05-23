/*
 * Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na 
 * tela a média aritmética somente dos números pares lidos, com uma casa decimal. 
 * Se nenhum número par for digitado, mostrar a mensagem "NENHUM NUMERO PAR"
 */

package exercicio8_vetores;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter a size: ");
		int size =  scan.nextInt();
		
		double average = 0.0;
		int numPairs = 0;
		int[] vector = new int[size];
		
		for(int i = 0; i < size; i++) {
			System.out.print("Type a number: ");
			vector[i] = scan.nextInt();
			if(vector[i]%2 == 0) {
				average += vector[i];
				numPairs++;
			}
		}
		
		average /= numPairs;
		
		if(numPairs > 0) {
			System.out.println("Average of pairs: " + average);
		} else {
			System.out.println("No pairs");
		}
		
		scan.close();
	}

}
