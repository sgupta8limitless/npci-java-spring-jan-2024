package com.thorprac.spring_demo_npci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    		
//    	ApplicationContext applicationContext = 
//    			new ClassPathXmlApplicationContext("beans.xml");
//    	
    	
    	ApplicationContext applicationContext = 
    			new AnnotationConfigApplicationContext(AppConfig.class);
  
    	UserClient userClient 
    	= (UserClient)applicationContext.getBean("userClient");
    	
    	userClient.setData();
    	
    	BasicValidation basicValidation1 
    	= applicationContext.getBean("basicValidation",BasicValidation.class);
    	
    	basicValidation1.setName("thor");
    	
    	BasicValidation basicValidation2 
    	= applicationContext.getBean("basicValidation",BasicValidation.class);
    	
     System.out.println(basicValidation2.getName());
    	
    	System.out.println(basicValidation1);
    	System.out.println(basicValidation2);
    	
    	
    	
    	
   
        
        
    }
}
