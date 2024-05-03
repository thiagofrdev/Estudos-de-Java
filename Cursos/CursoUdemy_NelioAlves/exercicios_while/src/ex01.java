/*
 * Escreva um programa que repita a leitura de uma senha até que ela seja 
 * válida. Para cada leitura de senha incorreta informada, escrever a mensagem
 * "Senha Invalida". Quando a senha for informada corretamente deve ser 
 * impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere 
 * que a senha correta é o valor 2002.
 */

import java.util.Scanner;
public class ex01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int senha;
		
		System.out.print("Digite uma senha: ");
		senha = ler.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Invalida");
			System.out.print("Digite outra senha: ");
			senha = ler.nextInt();
		}
		System.out.println("Acesso Permitido");
		ler.close();
	}

}
