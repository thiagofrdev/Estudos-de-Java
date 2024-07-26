/*b) Ler 8 elementos em uma matriz A tipo vetor. Construir uma matriz B de 
 * mesma dimensão com os elementos da matriz A multiplicados por 3. O elemento
 * B[i] deverá ser implicado pelo elemento A[i]*3, o elemento B[2] implicado 
 * pelo elemento A[2]*3 e assim por diante, até 8. Apresentar o vetor B.
*/

package exercicio02_vetores;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[8];
		int[] B = new int[8];
		
		for(int i = 0;i<8;i++) {
			System.out.printf("Digite o %dº valor: ", i+1);
			A[i] = scan.nextInt();
			B[i] = A[i]*3;
		}
		
		System.out.println("\nValores de A:");
		for(int num: A) {
			System.out.printf("[%d] ", num);
		}
		
		System.out.println("\nValores de B:");
		for(int num: B) {
			System.out.printf("[%d] ", num);
		}
		
		scan.close();
	}

}
