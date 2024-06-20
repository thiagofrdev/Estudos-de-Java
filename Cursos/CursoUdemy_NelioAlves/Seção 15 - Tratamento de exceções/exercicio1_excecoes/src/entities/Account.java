package entities;

import exceptions.DomainExeption;

public class Account {
	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	
	public Account() {
	}

	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) throws DomainExeption {
		if(amount > withdrawLimit) {
			throw new DomainExeption("Withdraw error: The amount exceeds withdraw limit");
		}
		if(amount > balance) {
			throw new DomainExeption("Withdraw error: Not enought balance");
		}
		balance -= amount;
	}
}
