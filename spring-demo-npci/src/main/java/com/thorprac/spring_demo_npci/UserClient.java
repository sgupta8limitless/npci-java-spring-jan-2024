package com.thorprac.spring_demo_npci;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class UserClient {
	
	Scanner scanner = new Scanner(System.in);
	
//	@Autowired
//	@Qualifier("advancedValidation")
	Validation validation  ;
	
	@Autowired
	GeneralPrinting generalPrinting;
	
//	@Autowired
//	public UserClient(@Qualifier("advancedValidation") Validation validation)
//	{
//		this.validation = validation;
//	}
	
	
	@Autowired
	public void setValidation(@Qualifier("advancedValidation") Validation validation)
	{
		this.validation = validation;
	}
	
	
		
	public void setData()
	{
		System.out.println("Enter Name");
		String data = scanner.next();
		
		String result = validation.validate(data);
			
		if(result!=null)
		{
			System.out.println("putting in data base");
			generalPrinting.printSomething();
		}
		else 
		{
			throw new RuntimeException("Some Issue");
		}
		
		
	}
	

}
