/*
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três 
 * trimestres do ano (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao 
 * final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado 
 * (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter o 
 * mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para 
 * resolver este problema.
 */

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.print("Enter your name: ");
		student.name = scan.nextLine();
		System.out.print("Enter your frist note: ");
		student.nota1 = scan.nextDouble();
		System.out.print("Enter your second note: ");
		student.nota2 = scan.nextDouble();
		System.out.print("Enter your third note: ");
		student.nota3 = scan.nextDouble();
		
		double finalGrade = student.average();
		String status = student.result();
		
		if(student.average() < 60) {
			System.out.printf("FINAL GRADE = %.2f\n%s\nMISSING %.2f POINTS", finalGrade, status, student.missingPoints);
		} else {
			System.out.printf("FINAL GRADE = %.2f\n%s", finalGrade, status);
		}
		
		
		scan.close();
	}

}
