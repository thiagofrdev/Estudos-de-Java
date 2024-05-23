/*
 * Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas 
 * idades. Os nomes devem ser armazenados em um vetor, e as idades em um outro vetor. 
 * Depois, mostrar na tela o nome da pessoa mais velha. 
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number of peoples: ");
		int size = scan.nextInt();
		
		People[] people = new People[size];//Criando array de Objetos "People" para armazenar as informações. Cada valor desse array tem um objeto People (com nome e idade)
		
		for(int i = 0; i < size; i++) {
			scan.nextLine();//Consome a sobre de linha
			System.out.printf("Name of %d people: ", i+1);
			String name = scan.nextLine();
			System.out.printf("Age of %d people: ", i+1);
			int age = scan.nextInt();
			people[i] = new People(name, age);//Uma nova People é criada a cada giro do for
		}
		
		People olderPerson = people[0];//Cria uma variável que aponta para o endereço de memória do primeiro valor do array "people" criado mais acima. Como os valores minimos da classe People já foram atribuidos antes, não e necessário criar um construtor
		for(int i = 1; i < people.length; i++) {
			if(people[i].getAge() > olderPerson.getAge()) {//Simplesmente criar uma variável com o tipo da classe também herda os métodos (getName, getAge) dessa classe 
				olderPerson = people[i];
			}
		}
		
		System.out.print("The older person is: " + olderPerson.getName());
		
		scan.close();
	}

}
