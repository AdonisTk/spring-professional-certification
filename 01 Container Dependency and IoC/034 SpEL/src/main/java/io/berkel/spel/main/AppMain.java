package io.berkel.spel.main;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import io.berkel.spel.config.AppConfig;
import io.berkel.spel.model.ArithmeticOperator;
import io.berkel.spel.model.ConditionalOperator;
import io.berkel.spel.model.LogicalOperator;
import io.berkel.spel.model.RegExOperator;
import io.berkel.spel.model.RelationalLogicalOperator;

public class AppMain {
	
	public static void main(String[] args) {
	
		ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		ArithmeticOperator arithmeticOperator = context.getBean(ArithmeticOperator.class);
		RelationalLogicalOperator relationalLogicalOperator = context.getBean(RelationalLogicalOperator.class);
		LogicalOperator logicalOperator = context.getBean(LogicalOperator.class);
		ConditionalOperator conditionalOperator = context.getBean(ConditionalOperator.class);
		RegExOperator regExOperator = context.getBean(RegExOperator.class);
		
		System.out.println("*************Arithmetical Operators*************");
		System.out.println(arithmeticOperator.getAdd());
		System.out.println(arithmeticOperator.getAddString());
		System.out.println(arithmeticOperator.getSubtract());
		System.out.println(arithmeticOperator.getMultiply());
		System.out.println(arithmeticOperator.getDivide());
		System.out.println(arithmeticOperator.getDivideAlphabetic());
		System.out.println(arithmeticOperator.getModulo());
		System.out.println(arithmeticOperator.getModuloAlphabetic());
		System.out.println(arithmeticOperator.getPowerOf());
		System.out.println(arithmeticOperator.getBrackets());
		
		System.out.println("*************Relational Logical Operators*************");
		System.out.println(relationalLogicalOperator.isEqual());
		System.out.println(relationalLogicalOperator.isEqualAlphabetic());
		System.out.println(relationalLogicalOperator.isNotEqual());
		System.out.println(relationalLogicalOperator.isNotEqualAlphabetic());
		System.out.println(relationalLogicalOperator.isLessThan());
		System.out.println(relationalLogicalOperator.isLessThanAlphabetic());
		
		System.out.println("*************Logical Operators*************");
		System.out.println(logicalOperator.isAnd());
		System.out.println(logicalOperator.isAndAlphabetic());
		System.out.println(logicalOperator.isNot());
		System.out.println(logicalOperator.isNotAlphabetic());
		System.out.println(logicalOperator.isOr());
		System.out.println(logicalOperator.isOrAlphabetic());
		
		System.out.println("*************Conditional Operators*************");
		System.out.println(conditionalOperator.getTernary());
		
		System.out.println("*************RegEx Operators*************");
		System.out.println(regExOperator.isValidAlphabeticStringResult());
		System.out.println(regExOperator.isInvalidAlphabeticStringResult());
		System.out.println(regExOperator.isValidNumericStringResult());
		System.out.println(regExOperator.isInvalidNumericStringResult());
		
		context.close();
		
	}	

}
