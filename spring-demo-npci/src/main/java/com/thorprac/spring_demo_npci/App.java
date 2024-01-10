package com.thorprac.spring_demo_npci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	ApplicationContext applicationContext = 
    			new ClassPathXmlApplicationContext("beans.xml");
    	
  
    	UserClient userClient 
    	= (UserClient)applicationContext.getBean("userClient");
    	
    	userClient.setData();
    	
   
        
        
    }
}