package com.solid.srp;

public class Customer {
	private String name;
	private String email;
	private String phone;
	private Account account;
	
	public Customer(String name, String email, String phone, Account account) {
		super();
		this.name = name;
		this.email = email;
		this.phone = phone;
		this.setAccount(account);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPhone() {
		return this.phone;
	}
	
	public int openAccount() {
		int max = 10;
        int min = 1;
        int range = max - min + 1;
		return (int) (Math.random() * range) + min;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}
	
}
