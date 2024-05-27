/*
 * A dona de um pensionato possui dez quartos para alugar para estudantes, sendo 
 * esses quartos identificados pelos números 0 a 9.
 * 
 * Fazer um programa que inicie com todos os dez quartos vazios, e depois leia 
 * uma quantidade N representando o número de estudantes que vão alugar quartos 
 * (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes. Para 
 * cada registro de aluguel, informar o nome e email do estudante, bem como qual 
 * dos quartos ele escolheu (de 0 a 9). Suponha que seja escolhido um quarto vago. 
 * Ao final, seu programa deve imprimir um relatório de todas ocupações do 
 * pensionato, por ordem de quarto, conforme exemplo.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Student[] rooms = new Student[10];//Cria um vetor de 10 posições (quartos) do tipo Student. Tipo esse que espera objetos (com valores name e email)  
		
		System.out.print("Enter a number of students: ");
		int size = scan.nextInt();
		
		for(int i = 0; i < size; i++) {
			System.out.println("RENT " + (i+1) + "");
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Email: ");
			String email = scan.nextLine();
			System.out.print("Room: ");
			int room = scan.nextInt();
			
			Student students = new Student(name, email);//Cria o objeto temporário para por no vetor
			rooms[room] = students;//Cada quarto recebe seu estudante, indicado na linha acima. O estudante é reiniciado a cada ciclo do for
			
			//Mais simplificado:
			//rooms[room] = new Student(name, email);
			//Já cria o objeto dentro do vetor
			
			System.out.println("");
		}
		
		System.out.println("Busy rooms:");
		for(int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.println(i + ": " + rooms[i]);
			}
		}

	}

}
