package io.berkel.springbeanlifecycle;

public class ExampleBeanImpl implements ExampleBean {
	
	public void init() {
		System.out.println("ExampleBeanImpl is going through init.");
	}
	
	public void destroy() {
		System.out.println("ExampleBeanImpl is going through destroy.");
	}

	@Override
	public void printMessage() {
		System.out.println("Hello from ExampleBeanImpl!");
	}

}
