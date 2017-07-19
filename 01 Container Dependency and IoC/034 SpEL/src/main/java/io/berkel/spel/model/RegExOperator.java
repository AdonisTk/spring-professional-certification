package io.berkel.spel.model;

import org.springframework.beans.factory.annotation.Value;

public class RegExOperator {
	
	@Value("#{'100' matches '\\d+' }") // Will inject true
	private boolean validNumericStringResult;
	 
	@Value("#{'100fghdjf' matches '\\d+' }") // Will inject false
	private boolean invalidNumericStringResult;
	 
	@Value("#{'valid alphabetic string' matches '[a-zA-Z\\s]+' }") // Will inject true
	private boolean validAlphabeticStringResult;
	 
	@Value("#{'invalid alphabetic string #$1' matches '[a-zA-Z\\s]+' }") // Will inject false
	private boolean invalidAlphabeticStringResult;

	public boolean isValidNumericStringResult() {
		return validNumericStringResult;
	}

	public void setValidNumericStringResult(boolean validNumericStringResult) {
		this.validNumericStringResult = validNumericStringResult;
	}

	public boolean isInvalidNumericStringResult() {
		return invalidNumericStringResult;
	}

	public void setInvalidNumericStringResult(boolean invalidNumericStringResult) {
		this.invalidNumericStringResult = invalidNumericStringResult;
	}

	public boolean isValidAlphabeticStringResult() {
		return validAlphabeticStringResult;
	}

	public void setValidAlphabeticStringResult(boolean validAlphabeticStringResult) {
		this.validAlphabeticStringResult = validAlphabeticStringResult;
	}

	public boolean isInvalidAlphabeticStringResult() {
		return invalidAlphabeticStringResult;
	}

	public void setInvalidAlphabeticStringResult(boolean invalidAlphabeticStringResult) {
		this.invalidAlphabeticStringResult = invalidAlphabeticStringResult;
	}
	
}
