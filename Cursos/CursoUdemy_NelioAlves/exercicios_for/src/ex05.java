/*
 * Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de
 * N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição,
 * fatorial de 0 é 1.
 */

import java.util.Scanner;
public class ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int multi = 0;

		System.out.print("Fatorial: ");
		int num = ler.nextInt();
		multi = num;
		
		if(num>0) {
			for(int i = 1; i<num; i++) {
				multi = multi * (num-i);
			}
			System.out.printf("O fatorial de %d é %d", num, multi);
		} else {
			System.out.println("O fatorial de 0 é 1");
		}
		
		ler.close();
	}

}
