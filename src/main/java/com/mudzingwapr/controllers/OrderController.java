package com.mudzingwapr.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mudzingwapr.models.Customer;
import com.mudzingwapr.services.CustomerServiceInterf;
import com.mudzingwapr.services.ProductServiceIntef;
@Controller
public class OrderController {
	@Autowired
	private CustomerServiceInterf customerservice;
	@Autowired
	private ProductServiceIntef productservice;

	@PostMapping("/placeOrder")
	public Customer placeOrder(Customer cus) {
		return customerservice.placeOrder(cus);
	}
	@GetMapping("/showAllOrder")
	public List<Customer> listAllOrders(){
		return customerservice.listOrder();
	}
}
