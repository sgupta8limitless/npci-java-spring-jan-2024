package com.thorprac.spring_demo_npci;

public class AdvancedValidation implements Validation {
	
	public String validate(String data)
	{
		if(data.length()!=0 && data.length()<=8 && data.contains("f")==false)
		{
			System.out.println("Advanced Validation");
			return data;
		}
		else 
		{
			return null;
		}
	}

}
