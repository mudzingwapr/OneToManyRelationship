package com.mudzingwapr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mudzingwapr.models.Customer;
import com.mudzingwapr.repository.CustomerRepository;
@Service
public class OrderServiceImplem implements CustomerServiceInterf {
	@Autowired
	private CustomerRepository customerepo;
	@Override
	public Customer placeOrder(Customer cus) {
		// TODO Auto-generated method stub
		return customerepo.save(cus);
	}

	@Override
	public List<Customer> listOrder() {
		// TODO Auto-generated method stub
		return customerepo.findAll();
	}

	@Override
	public Customer UpdateCust(Customer cus) {
		// TODO Auto-generated method stub
		return customerepo.saveAndFlush(cus);
	}

}
