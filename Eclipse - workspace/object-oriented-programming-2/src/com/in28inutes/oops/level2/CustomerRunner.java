package com.in28inutes.oops.level2;

public class CustomerRunner {

	public static void main(String[] args) {
	
	
	Address homeAddress = new Address("line1", "Hyderabad", "500035");
	Customer customer = new Customer("Ranga", homeAddress);
		System.out.println(customer);
	
		Address workAddress = new Address("line1 for work", "Hyderabad", "500035");
    customer.setWorkAddress(workAddress);

		System.out.println(customer);

	}
}
