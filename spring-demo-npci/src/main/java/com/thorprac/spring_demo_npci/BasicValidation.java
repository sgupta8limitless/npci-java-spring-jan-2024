package com.thorprac.spring_demo_npci;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Primary
@Scope("prototype")
public class BasicValidation implements Validation {

	String name;
	
	public String validate(String data)
	{
		if(data.length()!=0 && data.length() <=8)
		{
			System.out.println("Basic Validation");
			return data;
		}
		
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	

}
