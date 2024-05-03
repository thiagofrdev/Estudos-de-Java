/*
 * Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 
 * 1 até X, um valor por linha, inclusive o X, se for o caso.
 */

import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int aux = 0;

		System.out.println("Escreva um número inteiro (1 até 1000)");
		int x = ler.nextInt();
		aux = x;
		
		for(int i=0; i<x; i++) {
			if(aux%2!=0) {
				System.out.println(aux);
			}
			aux--;
		}
		
		ler.close();
	}

}
