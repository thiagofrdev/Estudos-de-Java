package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Nome: ");
		employee.name = scan.next();
		System.out.print("Gross salary: ");
		employee.grossSalary = scan.nextDouble();
		System.out.print("Tax: ");
		employee.tax = scan.nextDouble();
		
		System.out.printf("\nName: %s\nSalary: %.2f", employee.name, employee.netSalary());
		
		System.out.print("\n\nPercentage to increase salary: ");
		double percentage = scan.nextDouble();
		
		employee.inceraseSalary(percentage);
		
		System.out.printf(employee.toString());
	}

}
