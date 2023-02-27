package com.springboot.app.productos.services;

import java.util.List;

import com.springboot.app.productos.models.Product;

public interface IProductService {
	
	public List<Product> findAll();
	public Product findById(Long id);
}
