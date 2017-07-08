package io.berkel.junitspring.service;

import io.berkel.junitspring.model.Order;

public interface SampleService {
	
	public Order getOrder(int id);
	
	public Order createOrder(Order order);
	
}
