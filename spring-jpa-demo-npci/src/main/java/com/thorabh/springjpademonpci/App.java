package com.thorabh.springjpademonpci;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.amqp.RabbitConnectionDetails.Address;
import org.springframework.context.annotation.Bean;

import jakarta.transaction.Transactional;


@SpringBootApplication

public class App {
	
	
	
	public static void main(String args[])
	{
		SpringApplication.run(App.class, args);
			
	}
	
	@Bean
	CommandLineRunner commandLineRunner(
			CustomerRepository customerRepository,
			AdressRepository adressRepository,
			ProductRepository productRepository,
			Customer_ProductRepository customer_ProductRepository)
	{
		return args -> {
			

//		  Optional<Customer> customerOP = customerRepository.findById(1L);
//		  
//		  if(customerOP.isPresent())
//		  {
//			  Customer customer = customerOP.get();
//			  
//			  Adress adress = new Adress(405, "Akesh Town", "Akesh Road", "Akeshopolis", 789);
//			  
//			  adress.setCustomer(customer);
//			  
//			  adressRepository.save(adress);
//			  
//			  
//		  }
			
			
//			Customer customer1 = new Customer("Sai","sai@gmail.com", "Hyderabad", 28);
//			Customer customer2 = new Customer("Sajal","sajalgmail.com", "Banglore",31);
//			
//			customerRepository.saveAll(List.of(customer1,customer2));
//			
//			Product p1 = new Product("Samsung M51", 23000);
//			Product p2 = new Product("Cofee Mug", 300);
//			Product p3 = new Product("Leather Bag", 5000);
//			
//			productRepository.saveAll(List.of(p1,p2,p3));
//			
			
			
			  Optional<Customer> customerOP = customerRepository.findById(1L);
			  Optional<Product> productOP = productRepository.findById(2L);
			  
			  if(customerOP.isPresent() && productOP.isPresent())
			  {
				  Customer customer = customerOP.get();
				  Product product = productOP.get();
				  
				
				  Customer_Product cp = new Customer_Product(1);
				  
				  cp.setCustomer(customer);
				  cp.setProduct(product);
				  
				  customer_ProductRepository.save(cp);
				  
				  
			  }
			
			
			
			
	
			
			
			
		};
	}

}
