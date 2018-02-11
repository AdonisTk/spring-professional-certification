package io.berkel.initdestroy;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		MessageImpl msg = (MessageImpl) context.getBean("message");
		ExampleBeanImpl exampleBean = (ExampleBeanImpl) context.getBean("exampleBean");
		CachingMovieLister cachingMovieLister = (CachingMovieLister) context.getBean("cachingMovieLister");

		msg.printMessage();
		exampleBean.printMessage();
        cachingMovieLister.start();

        context.close();

	}

}
