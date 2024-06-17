package entities;

public class BusinessAccount extends Account {
	private Double loanLimit;
	
	public BusinessAccount() {
		super();//Caso alguma lógica seja implementada no contrutor padrão da classe Account, essa lógica será executada nessa subclasse
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	} 

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(double amount) {
		if(amount <= loanLimit) {
			balance += amount - 10;
		}
	}
	
	public void withdraw(double amount) {
		super.withdraw(amount);//Reaproveitanto a função da superclasse
		balance -= 2.0;
	}
}
