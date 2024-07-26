//a) Ler 10 elementos de uma matriz tipo vetor e apresentá-los.

package exercicio01_vetores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] vet = new int[10];
		
		for(int i = 0; i < 10; i++) {
			System.out.printf("Digite o %dº elemento: ", i+1);
			vet[i] = scan.nextInt();
		}
		
		System.out.println("\nOs valores digitados foram:");
		for(int num : vet){
			System.out.printf("[%d] ", num);
		}
		
		scan.close();
	}

}
