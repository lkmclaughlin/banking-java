package com.maxtrain.bootcamp.banking;

public class Savings extends Account {
	private double interestRate = 0.12;
	
	public void payInterest(int months) throws Exception{
		var interest = calculateInterest(months);
		deposit(interest);
	}
	
	private double calculateInterest(int months) {
		if(months < 1) {
			return 0;
		}
		return getBalance() * (getInterestRate() / 12) * months;
		
	}
	
	private double getInterestRate() {
		return interestRate;
	}

	public Savings(String description) {
		super(description);
	}
	/*
	 * public Savings() { super(); }
	 * 
	 * public Savings() { this("New Savings"); }
	 */
	
}	
