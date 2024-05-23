/*
 * Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que 
 * eles tiraram no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada 
 * em um vetor. Depois, imprimir os nomes dos alunos aprovados, considerando aprovados 
 * aqueles cuja média das notas seja maior ou igual a 6.0 (seis).
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a number of students: ");
		int size = scan.nextInt();
		
		String[] studentName = new String[size];
		double[][] studentGrade = new double[size][2];//Matriz de "size" linhas e 2 colunas
		
		for(int i = 0; i < size; i++) {
			scan.nextLine();
			System.out.printf("Name of %d student: ", i+1);
			String name = scan.nextLine();
			studentName[i] = name;
			System.out.print("Grade 1: ");
			double grade1 = scan.nextDouble();
			System.out.print("Grade 2: ");
			double grade2 = scan.nextDouble();
			studentGrade[i][0] = grade1;
			studentGrade[i][1] = grade2;
		}
		
		System.out.print("Aproved: ");
		for(int i = 0; i < size; i++) {
			Student student = new Student(studentName[i], studentGrade[i][0], studentGrade[i][1]);
			if(student.approved()) {
				System.out.print(" [" + student.getName() + "] ");
			}
		}
		
		scan.close();
	}

}

