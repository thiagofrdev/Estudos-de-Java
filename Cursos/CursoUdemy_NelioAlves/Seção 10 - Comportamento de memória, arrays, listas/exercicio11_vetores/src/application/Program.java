/*
 * Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. 
 * Fazer um programa que calcule e escreva a maior e a menor altura do grupo, a média 
 * de altura das mulheres, e o número de homens.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Peoples;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number of students: ");
		int size = scan.nextInt();
		
		Peoples people;

		for(int i = 0; i < size; i++) {
			System.out.printf("Genere of %dº person", i+1);
			char gen = scan.nextLine().charAt(0);
			System.out.printf("Height of %dº person", i+1);
			double height = scan.nextDouble();
			people = new Peoples(gen, height);
			peo
		}
		
		scan.close();
	}

}
