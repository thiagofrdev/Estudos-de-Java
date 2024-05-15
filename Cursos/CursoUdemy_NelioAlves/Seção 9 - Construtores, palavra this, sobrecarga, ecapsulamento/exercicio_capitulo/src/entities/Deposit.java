package entities;

public class Deposit {
	static double deposit;
	
	public Deposit() {
		
	}
	
	public static double getDeposit() {
		return deposit;
	}

	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	//FUNCTIONS
	public void addDeposit(double newDeposit) {
		deposit += newDeposit;
	}
	
	public void withdrawDeposit(double withdraw) {
		deposit -= withdraw+5;
	}
	
}
