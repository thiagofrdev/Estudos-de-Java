/*
 * Leia 1 valor inteiro N, que representa o número de casos de teste que vem
 * a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles
 * com uma casa decimal. Apresente a média ponderada para cada um destes
 * conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
 * valor tem peso 3 e o terceiro valor tem peso 5.
 */

import java.util.Scanner;
import java.util.Locale;
public class ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ler.useLocale(Locale.US);
		double soma = 0;
		double media = 0;
		//double valor = 0;
		
		System.out.print("Insira a quantidade: ");
		int n = ler.nextInt();
		
		for(int i=1; i<=n; i++) {
			double valor = 0;
			System.out.printf("Insira o %d° valor: ", i);
			valor += ler.nextDouble();
			switch (i) {
			case 1:
				valor *= 2;
				break;
			case 2:
				valor *= 3;
				break;
			case 3:
				valor *= 5;
			}
			soma += valor;
		}
		media = soma/(2+3+5);
		System.out.printf("Média: %.1f", media);
		
		ler.close();
	}

}
