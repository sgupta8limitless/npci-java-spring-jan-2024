package com.thorprac.spring_demo_npci;

public class BasicValidation implements Validation {

	
	public String validate(String data)
	{
		if(data.length()!=0 && data.length() <=8)
		{
			System.out.println("Basic Validation");
			return data;
		}
		
		return null;
	}
	
	
	

}
