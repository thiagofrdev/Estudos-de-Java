/*
 * Fazer um programa para ler um número N. Depois leia N pares de números e 
 * mostre a divisão do primeiro pelo segundo. Se o denominador for igual a 
 * zero, mostrar a mensagem "divisao impossivel".
 */

import java.util.Scanner;
public class ex04 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Insira a quantidade: ");
		int n = ler.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.print("Divisor: ");
			int divsor = ler.nextInt();
			System.out.print("Denominador: ");
			int denomi = ler.nextInt();
			
			if(denomi!=0) {
				double divisao = (double)divsor/(double)denomi;
				System.out.printf("Resultado: %.1f\n\n", divisao);
			} else {
				System.out.println("Divisao impossivel\n");
			}
		}
		
		ler.close();
	}

}
