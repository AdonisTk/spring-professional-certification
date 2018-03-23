package io.berkel.springbeanlifecycle;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        MessageImpl msg = (MessageImpl) context.getBean("message");
        ExampleBeanImpl exampleBean = (ExampleBeanImpl) context.getBean("exampleBean");

        msg.printMessage();
        exampleBean.printMessage();

        context.close();

    }

}
