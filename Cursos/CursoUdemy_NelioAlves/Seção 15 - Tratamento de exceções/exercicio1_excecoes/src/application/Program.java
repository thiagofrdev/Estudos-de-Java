package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import exceptions.DomainExeption;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
				
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = scan.nextInt();
			System.out.print("Holder: ");
			scan.next();
			String holder = scan.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = scan.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = scan.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.print("\nEnter amount for withdraw: ");
			double amountWithdraw = scan.nextDouble();
			
		try {
			account.withdraw(amountWithdraw);
			System.out.println("New balance: " + account.getBalance());
		}
		catch (DomainExeption e){
			System.out.print(e.getMessage());
		}
		
		scan.close();
	}

}
