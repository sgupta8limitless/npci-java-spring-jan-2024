package com.thorabh.shoply.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thorabh.shoply.models.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

	Product findProductByName(String name);
}
