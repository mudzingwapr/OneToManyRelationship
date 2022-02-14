package com.mudzingwapr.services;

import java.util.List;

import com.mudzingwapr.models.Product;

public interface ProductServiceIntef {
	public List<Product> showProduct();
	public Product saveProduct(Product pro);
	public void Delete(Integer id);

}
