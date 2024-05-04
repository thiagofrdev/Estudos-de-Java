/*
 * Fazer um programa para ler um número inteiro positivo N. O programa deve
 * então mostrar na tela N linhas, começando de 1 até N. Para cada linha, 
 * mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
 * exemplo.
 */

import java.util.Iterator;
import java.util.Scanner;
public class ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		System.out.print("Escreva um número: ");
		int num = ler.nextInt();
		
		for (int i = 1; i <= num; i++) {
			System.out.printf("\n%d %d %d", i, i*i, i*i*i);
		}
		
		ler.close();
	}

}
