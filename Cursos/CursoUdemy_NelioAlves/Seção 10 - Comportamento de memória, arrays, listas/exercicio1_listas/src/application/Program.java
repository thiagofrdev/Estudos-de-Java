/*
 * Fazer um programa para ler um número inteiro N e depois os dados (id, nome e 
 * salario) de N funcionários. Não deve haver repetição de id.
 * 
 * Em seguida, efetuar o aumento de X por cento no salário de um determinado 
 * funcionário. Para isso, o programa deve ler um id e o valor X. Se o id 
 * informado não existir, mostrar uma mensagem e abortar a operação. Ao final, 
 * mostrar a listagem atualizada dos funcionários, conforme exemplos.
 * 
 * Lembre-se de aplicar a técnica de encapsulamento para não permitir que o 
 * salário possa ser mudado livremente. Um salário só pode ser aumentado com base 
 * em uma operação de aumento por porcentagem dada.
 */

package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();//Cria uma lista do tipo Employee
		
		System.out.print("Enter a number of emplyoees: ");
		int size = scan.nextInt();
		
		for(int i = 0; i < size; i++) {
			System.out.println("\nEmployee #" + (i+1) + ":");
			System.out.print("ID: ");
			Integer id = scan.nextInt();
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Salary: ");
			Double salary = scan.nextDouble();
			
			Employee employee = new Employee(id, name, salary);
			
			list.add(employee);
		}
		
		System.out.print("Enter the employee ID that will have salary increase: ");
		int idSalary = scan.nextInt();
		
		Integer pos = position(list, idSalary);//Encontra a posição do idSalary na lista
		if (pos == null) {
			System.out.println("This ID does not exist!");
		} else {
			System.out.print("Enter the percentage: ");
			double percent = scan.nextDouble();
			list.get(pos).increaseSalary(percent);;
;		}
	}

	public static Integer position(List<Employee> list, int id) {
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}
}
