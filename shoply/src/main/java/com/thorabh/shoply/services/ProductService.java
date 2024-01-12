package com.thorabh.shoply.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thorabh.shoply.models.Product;
import com.thorabh.shoply.repositories.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository productRepository;
	
	@Autowired
	public ProductService(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}


	public Product createProduct(Product product)
	{
		return productRepository.save(product);
	}
	
	
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
	}
	
	
	public Product getProductByName(String name)
	{
		return productRepository.findProductByName(name);
	}
	
	
	public Product getProductById(Long id)
	{
		Optional<Product> productOptional = productRepository.findById(id);
		
		if(productOptional.isPresent())
		{
			return productOptional.get();
		}
		
		throw new RuntimeException("Product Not Found");
		
		
	}
	
	
	public Product updateProduct(Product product,Long id)
	{
		
		Optional<Product> productOptional = productRepository.findById(id);
		
		if(productOptional.isPresent())
		{
			Product productToUpdate = productOptional.get();
			productToUpdate.setName(product.getName());
			productToUpdate.setPrice(product.getPrice());
			productToUpdate.setQuantity(product.getQuantity());
			
			return productRepository.save(productToUpdate);
		}
		
		throw new RuntimeException("Product Not Found");
		
		
	}
	
	
	public void deleteProduct(Long id)
	{
		Optional<Product> productOptional = productRepository.findById(id);
		
		if(productOptional.isPresent())
		{
			productRepository.deleteById(id);
		}
		else
		{
			throw new RuntimeException("Product Not Found");
		}
		
		
		
	}
	
}
