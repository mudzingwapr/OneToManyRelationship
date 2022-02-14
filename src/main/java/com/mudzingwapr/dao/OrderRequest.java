package com.mudzingwapr.dao;

import com.mudzingwapr.models.Customer;

import lombok.Data;
import lombok.ToString;
@Data
@ToString
public class OrderRequest {
	private Customer customer;

	public OrderRequest(Customer customer) {
		super();
		this.customer = customer;
	}

	public OrderRequest() {
		super();
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "OrderRequest [customer=" + customer + "]";
	}
	

}
