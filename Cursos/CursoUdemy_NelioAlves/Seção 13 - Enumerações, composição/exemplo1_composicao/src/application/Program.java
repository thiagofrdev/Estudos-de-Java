package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				
		System.out.print("Enter department's name: ");
		String departmentName = scan.nextLine();
		System.out.println("Enter worker data: ");
		System.out.print("Name: ");
		String workerName = scan.nextLine();
		System.out.print("Level: ");
		String workerLevel = scan.nextLine();
		System.out.print("Base Salary: ");
		double baseSalary = scan.nextDouble();
		
		//Instanciando um objeto do tipo Worker passandoo nome, uma intância de WorkerLevel do valor que foi digitado, o salário, e um outro objeto associado do tipo Department
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));
		
		System.out.print("How many contracts to this worker? ");
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter contract #%d data:\n", i+1);
			System.out.print("Date (DD/MM/YYYY): ");
			Date contractDate = sdf.parse(scan.next());
			System.out.print("Value per hour: ");
			double valuePerHour = scan.nextDouble();
			System.out.print("Duration (hours): ");
			int hours = scan.nextInt();
			
			HourContract contract = new HourContract(contractDate, valuePerHour, hours);
			worker.addContract(contract);
		}
		
		System.out.print("\nEnter month and year to calculate income (MM/YYYY): ");
		String monthAndYear = scan.next();
		//Pega a data digitada pelo usuário e racorta os dois primeiros Char's da String 
		int month = Integer.parseInt(monthAndYear.substring(0, 2));
		//Pega a data digitada pelo usuário e racorta a partir do terceiro Char
		int year = Integer.parseInt(monthAndYear.substring(3));
		System.out.println("Name: " + worker.getName());
		//Aqui o nome do departamento é pego a partir da classe Worker. Nessa classe, o getDepartment() acessa a classe Department, que está acssociada, e por seguinte chama o getName()
		System.out.println("Department: " + worker.getDepartment().getName());
		System.out.println("Income for: " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));
		
		scan.close();
	}

}
