package io.berkel.springbeanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class MessageImpl implements Message, InitializingBean, DisposableBean {

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MessageImpl is going through afterPropertiesSet.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("MessageImpl is going through destroy.");
	}

	@Override
	public void printMessage() {
		System.out.println("Hello from MessageImpl!");
	}

}
