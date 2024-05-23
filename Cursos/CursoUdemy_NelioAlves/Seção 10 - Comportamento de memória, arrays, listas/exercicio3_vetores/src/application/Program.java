/*
 * Fazer um programa para ler nome, idade e altura de N pessoas, 
 * conforme exemplo. Depois, mostrar na tela a altura média das 
 * pessoas, e mostrar também a porcentagem de pessoas com menos 
 * de 16 anos, bem como os nomes dessas pessoas caso houver.
 */

package application;

import java.util.Scanner;
import java.util.Locale;

import entities.People;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a quantity of people: ");
		int size = scan.nextInt();
		
		People[] people = new People[size]; //Inicia um vetor da classe People
		double average = 0.0;
		int underage = 0;
		
		for(int i = 0; i < people.length; i++) {
			System.out.printf("\nEnter a name of %dª people: ", i+1);
			scan.nextLine();
			String name = scan.nextLine();
			System.out.printf("Enter a age of %dª people: ", i+1);
			int age = scan.nextInt();
			if(age < 16) {
				underage++; 
			}
			System.out.printf("Enter a height of %dª people: ", i+1);
			double height = scan.nextDouble();
			average += height;
			people[i] = new People(name, age, height);//Toda vez cria um novo objeto pessoa com as caracteristicas digitadas. Usando o "setName", por exemplo, só iria sobrescrever os dados e um único objeto. 
		}

		System.out.printf("Average height: %.2f", average/people.length);
		System.out.printf("\nPercentage of people under 16 years old: %.1f%%\n", ((double)underage/(double)people.length)*100);
		for(int i = 0; i < people.length; i++) {
			if(people[i].getAge() < 16) {
				 System.out.println(people[i].getName());
			}
		}

		scan.close();
	}

}
