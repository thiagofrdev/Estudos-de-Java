package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.People;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int num = scan.nextInt(); 
		
		List<People> list = new ArrayList<People>();
		
		for (int i = 0; i < num; i++) {
			System.out.printf("Tax payer #%d data:\n", i+1);
			System.out.print("Individual or company (i/c)? "); 
			char payer = scan.next().charAt(0);
			System.out.print("Name: ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.print("Annual income: ");
			double annualIncome = scan.nextDouble();
			if(payer == 'i') {
				System.out.print("Health expenditures: ");
				double healthSpending = scan.nextDouble();
				People indi = new Individual(name, annualIncome, healthSpending);
				list.add(indi);
			} else if (payer == 'c') {
				System.out.print("Number of employees: ");
				int numberEmployees = scan.nextInt();
				People comp = new Company(name, annualIncome, numberEmployees);
				list.add(comp);
			}
			System.out.println("");
		}
		
		System.out.println("TAXES PAID:");
		double totalTaxes = 0.0;
		for(People p : list) {
			double tax = p.tax();
			System.out.println(p.getName() + ": R$" + String.format("%.2f", tax));
			totalTaxes += tax;
		}
		System.out.printf("\nTOTAL TAXES: R$%.2f", totalTaxes);
		
		scan.close();
	}
	
}

/*		 
 * SUPERCLASSE: 
 * 		People (name e annualIncome)
 * 			-> Função tax()
 * 
 * SUBCLASSES: 
 * 		Individual (healthSpending):
 * 			-> Renda < 20000 pagam 15% de imposto. Renda >= 20000 pagam 20%. Se teve gastos com saúde, 50% desse valor é abatido no imposto (Desconta o salário normalmente e depois abate)
 * 		LegalEntity (numberEmployees):
 * 			-> Paga 16% de imposto. Se tiver 10 < funcionários paga 14%
*/	