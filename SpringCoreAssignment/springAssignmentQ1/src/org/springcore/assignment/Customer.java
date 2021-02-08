package org.springcore.assignment;

public class Customer {
	
	private int customerId;
	private String customerName;
	private int customerContact;
	private Address customerAddress;
	
	
	
	public int getCustomerId() {
		return customerId;
	}



	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}



	public String getCustomerName() {
		return customerName;
	}



	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}



	public int getCustomerContact() {
		return customerContact;
	}



	public void setCustomerContact(int customerContact) {
		this.customerContact = customerContact;
	}


	public Address getCustomerAddress() {
		return customerAddress;
	}



	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}



	public void printDetails() {
		System.out.println("Customer ID: "+getCustomerId());
		System.out.println("Customer Name: "+getCustomerName());
		System.out.println("Customer Contact: "+getCustomerContact());
		System.out.println("Customer Address:\n Street: "+ getCustomerAddress().getStreet() +"\n City: "+getCustomerAddress().getCity() +"\n State: "+getCustomerAddress().getState()+"\n Zip Code: "+getCustomerAddress().getZip()+"\n Country: "+getCustomerAddress().getCountry() );
	}
}
