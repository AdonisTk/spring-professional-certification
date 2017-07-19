package io.berkel.spel.model;

import org.springframework.beans.factory.annotation.Value;

public class ConditionalOperator {
	
	@Value("#{2 > 1 ? 'a' : 'b'}") // Will inject "a"
	private String ternary;

	public String getTernary() {
		return ternary;
	}

	public void setTernary(String ternary) {
		this.ternary = ternary;
	}

}
