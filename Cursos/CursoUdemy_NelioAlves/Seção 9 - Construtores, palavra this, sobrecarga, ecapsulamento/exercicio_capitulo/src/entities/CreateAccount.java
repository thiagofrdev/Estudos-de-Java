package entities;

public class CreateAccount {
	
	//ATTRIBUTES
	private int accountNumber = 0;
	private String nameUser;
	
	//CONSTRUCTOR (!!Um construtor deve ter o exato mesmo nome da classe!!))
	public CreateAccount() {
	}

	//GET AND SET METHODS
	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
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
