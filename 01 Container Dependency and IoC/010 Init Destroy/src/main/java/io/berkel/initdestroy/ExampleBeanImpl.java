package io.berkel.initdestroy;

public class ExampleBeanImpl implements ExampleBean {

	@Override
	public void init() {
		System.out.println("ExampleBeanImpl is going through init.");
	}

	@Override
	public void destroy() {
		System.out.println("ExampleBeanImpl is going through destroy.");
	}

	@Override
	public void printMessage() {
		System.out.println("Hello from ExampleBeanImpl!");
	}

}
