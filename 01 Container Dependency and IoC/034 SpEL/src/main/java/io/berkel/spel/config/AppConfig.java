package io.berkel.spel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.berkel.spel.model.ArithmeticOperator;
import io.berkel.spel.model.ConditionalOperator;
import io.berkel.spel.model.LogicalOperator;
import io.berkel.spel.model.RegExOperator;
import io.berkel.spel.model.RelationalLogicalOperator;

@Configuration
public class AppConfig {
	
	@Bean
	public ArithmeticOperator getArithmeticOperator() {
		return new ArithmeticOperator();
	}
	
	@Bean
	public RelationalLogicalOperator getRelationalLogicalOperator() {
		return new RelationalLogicalOperator();
	}
	
	@Bean
	public LogicalOperator getLogicalOperator() {
		return new LogicalOperator();
	}

	@Bean
	public ConditionalOperator getConditionalOperator() {
		return new ConditionalOperator();
	}

	@Bean
	public RegExOperator getRegExOperator() {
		return new RegExOperator();
	}	
	
}
