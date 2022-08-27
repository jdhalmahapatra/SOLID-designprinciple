package com.solid.srp;

public class Account {
	private int accountNumber;
	private double balance;
	
	
	Account(int accountNumber, double balance){
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void transaction(double amount) {
		this.balance = this.balance - amount;
	}
}
