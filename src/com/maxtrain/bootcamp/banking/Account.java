package com.maxtrain.bootcamp.banking;

public class Account {
	private static int nextId = 1; 
	private int id = 0;
	private String description;
	private double balance = 0;
	
	public void deposit(double amount) throws Exception {
		checkAmountGTZero(amount);
		setBalance(getBalance() + amount);
	}
	
	public void withdraw(double amount) throws Exception {
		checkAmountGTZero(amount);
		checkInsufficientFunds(amount);
		setBalance(getBalance() - amount);
	}

	public void transfer(double amount, Account toAccount) throws Exception {
		withdraw(amount);
		toAccount.deposit(amount);
	
	}
	private void checkAmountGTZero(double amount) throws Exception {
		if(amount <= 0) {
			throw new Exception("Amount must be positive");
		}
	}
	
	private void checkInsufficientFunds(double amount) throws Exception {
		if(amount > getBalance()) {
			throw new Exception("Insufficient funds");
		}
	}
	
	public String toString() {
		return String.format("%2d | %-15s | %,7.2f%n", getId(), getDescription(), getBalance());
	}
	
	public Account(String description) {
		setId(nextId++);
		setDescription(description);
		setBalance(0);
	}
	public Account() {
		this("New Account");
	}
	
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getBalance() {
		return balance;
	}
	private void setBalance(double balance) {
		this.balance = balance;
	}
	
	
}
