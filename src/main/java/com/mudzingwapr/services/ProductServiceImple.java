package com.mudzingwapr.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mudzingwapr.models.Product;
import com.mudzingwapr.repository.ProductRepository;
@Service
public class ProductServiceImple implements ProductServiceIntef {
	@Autowired
	private ProductRepository produrepos;
	@Override
	public List<Product> showProduct() {

		return produrepos.findAll();
	}

	@Override
	public Product saveProduct(Product pro) {
		// TODO Auto-generated method stub
		return produrepos.save(pro) ;
	}

	@Override
	public void Delete(Integer id) {
		// TODO Auto-generated method stub
		produrepos.deleteById(id);
	}

}
