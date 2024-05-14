/*
 * Fazer um programa para ler os valores da largura e altura de um retângulo.
 * Em seguida, mostrar na tela o valor de sua área, perímetro e diagonal.
 * Usar uma classe como mostrado no projeto ao lado.
 */

package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Retangle;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Retangle retangle = new Retangle();
		
		System.out.print("Enter a width: ");
		retangle.width = scan.nextDouble(); //Envia direto para a classe Retangle
		System.out.print("Enter a height: ");
		retangle.height = scan.nextDouble();
		
		System.out.println(retangle);
		
		scan.close();
	}

}
