package io.berkel.junitspring.service;

import java.util.Date;
import java.util.Random;

import io.berkel.junitspring.model.Order;

public class SampleServiceImpl implements SampleService {
	
	public Order createOrder(Order order) {
		Order newOrder = new Order();
		newOrder.setOrderId(new Random().nextInt());
		newOrder.setSecurityCode("XYZ");
		newOrder.setOrderStatus("INITIATED");
		newOrder.setOrderDate(new Date());
		return newOrder;
	}
	
	public Order getOrder(int id) {
		Order newOrder = new Order();
		newOrder.setOrderId(new Random().nextInt());
		newOrder.setSecurityCode("XYZ");
		newOrder.setOrderStatus("COMPLETED");
		newOrder.setOrderDate(new Date());
		newOrder.setDescription("This is the new XYZ order");
		return newOrder;
	}
	
	

}
