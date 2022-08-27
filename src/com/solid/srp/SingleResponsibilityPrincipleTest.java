package com.solid.srp;

public class SingleResponsibilityPrincipleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account account = new Account(10, 10000);
		Customer customer = new Customer("Smith", "smith@gmail.com", "90901989301", account);
		
		
		System.out.println("Name: " + customer.getName());
		System.out.println("Email: "+ customer.getEmail());
		System.out.println("Phone: "+ customer.getPhone());
		
		System.out.println("---------------------------------------------------------");
		System.out.println("---------------------------------------------------------");
		
		
		System.out.println("Account Number: " + account.getAccountNumber());
		System.out.println("Balance: " + account.getBalance());
		
		System.out.println("After Transaction Done of Rs 336");
		account.transaction(336);
		System.out.println("Updated Balance : " + account.getBalance());
		
	}

}
