package com.mudzingwapr.services;

import java.util.List;

import com.mudzingwapr.models.Customer;

public interface CustomerServiceInterf {
	public Customer placeOrder(Customer cus);
	public List<Customer> listOrder();
	public Customer UpdateCust(Customer cus);
	
}
