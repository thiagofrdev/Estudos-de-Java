/*
 * Um Posto de combustíveis deseja determinar qual de seus produtos tem a
 * preferência de seus clientes. Escreva um algoritmo para ler o tipo de 
 * combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina
 * 3.Diesel 4.Fim). Caso o usuário informe um código inválido (fora da faixa
 * de 1 a 4) deve ser solicitado um novo código (até que seja válido).
 * O programa será encerrado quando o código informado for o número 4. 
 * Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes 
 * que abasteceram cada tipo de combustível, conforme exemplo.
 */

import java.util.Scanner;
public class ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int alcool = 0;
		int gasolina = 0;
		int disel = 0;
		
		System.out.println("=====================");
		System.out.println("POSTO THIAGO-DEV");
		System.out.print("---------------------");
		System.out.println("\nBem vindo(a)!!\nEscolha o que deseja:\n");
		System.out.println("1 - Álcool\n2 - Gasolina\n3 - Disel\n4 - Sair");
		System.out.println("=====================");
		System.out.print("Escolha -> ");
		int escolha = ler.nextInt();
		
		while(escolha != 4) {
			switch(escolha) {
			case 1:
				alcool++;
				break;
			case 2:
				gasolina++;
				break;
			case 3:
				disel++;
				break;
			}
			System.out.print("Escolha -> ");
			escolha = ler.nextInt();
		}
		System.out.println("\n========================");
		System.out.println("!!!Programa Encerrado!!!");
		System.out.printf("Álcool: %d\nGasolina: %d\nDisel: %d", alcool, gasolina, disel);
		System.out.println("\n========================");
		
		ler.close();
	}

}
