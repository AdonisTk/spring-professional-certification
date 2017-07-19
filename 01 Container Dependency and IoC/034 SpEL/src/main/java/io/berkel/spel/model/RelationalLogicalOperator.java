package io.berkel.spel.model;

import org.springframework.beans.factory.annotation.Value;

public class RelationalLogicalOperator {
	
	@Value("#{1 == 1}") // Will inject true
	private boolean equal;
	 
	@Value("#{1 eq 1}") // Will inject true
	private boolean equalAlphabetic;
	 
	@Value("#{1 != 1}") // Will inject false
	private boolean notEqual;
	 
	@Value("#{1 ne 1}") // Will inject false
	private boolean notEqualAlphabetic;
	 
	@Value("#{1 < 1}") // Will inject false
	private boolean lessThan;
	 
	@Value("#{1 lt 1}") // Will inject false
	private boolean lessThanAlphabetic;
	 
	public boolean isEqual() {
		return equal;
	}

	public void setEqual(boolean equal) {
		this.equal = equal;
	}

	public boolean isEqualAlphabetic() {
		return equalAlphabetic;
	}

	public void setEqualAlphabetic(boolean equalAlphabetic) {
		this.equalAlphabetic = equalAlphabetic;
	}

	public boolean isNotEqual() {
		return notEqual;
	}

	public void setNotEqual(boolean notEqual) {
		this.notEqual = notEqual;
	}

	public boolean isNotEqualAlphabetic() {
		return notEqualAlphabetic;
	}

	public void setNotEqualAlphabetic(boolean notEqualAlphabetic) {
		this.notEqualAlphabetic = notEqualAlphabetic;
	}

	public boolean isLessThan() {
		return lessThan;
	}

	public void setLessThan(boolean lessThan) {
		this.lessThan = lessThan;
	}

	public boolean isLessThanAlphabetic() {
		return lessThanAlphabetic;
	}

	public void setLessThanAlphabetic(boolean lessThanAlphabetic) {
		this.lessThanAlphabetic = lessThanAlphabetic;
	}

}
