/*
 * Leia um valor inteiro N. Este valor será a quantidade de valores inteiros
 * X que serão lidos em seguida. Mostre quantos destes valores X estão dentro
 * do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
 * informações conforme exemplo (use a palavra "in" para dentro do intervalo,
 * e "out" para fora do intervalo).
 */

import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int qtdIn = 0;
		int qtdOut = 0;

		System.out.print("Digite a quantidade: ");
		int qtd = ler.nextInt();		
		
		for(int i = 1; i<=qtd; i++) {
			System.out.printf("%d° número: ", i);
			int num = ler.nextInt();
			if(num>=10 && num<=20) {
				qtdIn++;
			} else {
				qtdOut++;
			}
		}
		System.out.printf("In: %d\nOut: %d", qtdIn, qtdOut);
		
		ler.close();
	}

}
