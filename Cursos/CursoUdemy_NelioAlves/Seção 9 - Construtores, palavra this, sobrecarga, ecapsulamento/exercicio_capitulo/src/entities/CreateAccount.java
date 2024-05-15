package entities;

public class CreateAccount {
	
	//ATTRIBUTES
	private int accountNumber = 0;
	private String nameUser;
	Deposit deposit = new Deposit();
	
	//CONSTRUCTOR (!!Um construtor deve ter o exato mesmo nome da classe!!))
	public CreateAccount(int accountNumber, String nameUser, double initialDeposit) {
		this.accountNumber = accountNumber;
		this.nameUser = nameUser;		
		deposit.addDeposit(initialDeposit);
	}
	
	public CreateAccount(int accountNumber, String nameUser) {
		this.accountNumber = accountNumber;
		this.nameUser = nameUser;
	}

	//GET AND SET METHODS
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getNameUser() {
		return nameUser;
	}

	public void setNameUser(String nameUser) {
		this.nameUser = nameUser;
	}

	//FUNCTIONS
	public String toString() {
		return "\n----------------------------"
				+ "\nAccont Holder: "
				+ nameUser
				+ "\nAccount Number: "
				+ accountNumber
				+ "\nBalance: $"
				+ Deposit.getDeposit()
				+ "\n----------------------------";
	}
}
