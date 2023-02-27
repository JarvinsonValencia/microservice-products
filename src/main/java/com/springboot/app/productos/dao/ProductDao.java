package com.springboot.app.productos.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.app.productos.models.Product;

public interface ProductDao extends JpaRepository<Product, Long>{

}
