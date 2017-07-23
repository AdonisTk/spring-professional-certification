package io.berkel.spel.main;

import io.berkel.spel.service.SpELCollection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	public static void main(String[] args) {
	
		ConfigurableApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");

		SpELCollection spELCollection = (SpELCollection) context.getBean(SpELCollection.class);

		// Here you can choose which bean do you want to load instead of spelConditional: spelCollections, spelLogical, etc.

		System.out.println(spELCollection);

        context.close();
		
	}	

}
