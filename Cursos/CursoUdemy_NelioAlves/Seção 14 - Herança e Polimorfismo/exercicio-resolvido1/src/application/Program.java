package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsoursedEmployee;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of employees: ");
		int num = scan.nextInt();
		
		List<Employee> list = new ArrayList<Employee>();//Lista de TIPOS Employee. Esses tipos podem ser INSTANCIADOS em classes diferentes
		
		for (int i = 0; i < num; i++) {
			System.out.printf("Employee #%d data:\n", i+1);
			System.out.print("Outsourced (y/n)? ");
			char outsourced = scan.next().charAt(0);
			scan.nextLine();
			System.out.print("Name: ");
			String name = scan.nextLine();
			System.out.print("Hours: ");
			int hours = scan.nextInt();
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			if(outsourced == 'y') {
				System.out.print("Additional charge: ");
				double addCharge = scan.nextDouble();
				Employee emp = new OutsoursedEmployee(name, hours, valuePerHour, addCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
			System.out.println("");
		}
		
		System.out.println("Payments: ");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - R$" + emp.payment());
		}
		
		scan.close();
	}

}
