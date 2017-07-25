package io.berkel.spel.main;

import io.berkel.spel.service.*;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMain {
	
	public static void main(String[] args) {
	
		ConfigurableApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext.xml");

		SpelArithmetic spelArithmetic = (SpelArithmetic) context.getBean(SpelArithmetic.class);
		SpelCollection spelCollection = (SpelCollection) context.getBean(SpelCollection.class);
		SpelConditional spelConditional = (SpelConditional) context.getBean(SpelConditional.class);
        SpelLogical spelLogical = (SpelLogical) context.getBean(SpelLogical.class);
        SpelRegex spelRegex = (SpelRegex) context.getBean(SpelRegex.class);
        SpelRelational spelRelational = (SpelRelational) context.getBean(SpelRelational.class);

        System.out.println(spelArithmetic);
        System.out.println(spelCollection);
        System.out.println(spelConditional);
        System.out.println(spelLogical);
        System.out.println(spelRegex);
        System.out.println(spelRelational);

        context.close();
		
	}	

}
