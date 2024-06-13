package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);		
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		//UPCASTING
		Account acc1 = bacc;//O BusinessAccount É UMA Account. Por isso é possível atribuir uma subclasse a sua classe herdada
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 0.0);
		Account acc3 = new SavingAccount(1004, "Anna", 0.0, 0.01);
		
		//DOWNCASTING
		//acc2.loan() --> ERRO. Atenção ao tipo. acc2 é do tipo Account, por isso o .loan() não é acessível por essa variável
		//BusinessAccount acc4 = acc2; --> ERRO
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		//BusinessAccount acc5 = (BusinessAccount)acc3; --> ERRO: Dá um erro quando o programa for excutado, pois acc3 foi instanciado como SavingAccount
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Loan!");
		}
		
		if(acc3 instanceof SavingAccount) {
			SavingAccount acc5 = (SavingAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
	}

}
