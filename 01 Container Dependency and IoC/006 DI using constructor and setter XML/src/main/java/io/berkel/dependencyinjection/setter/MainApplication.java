package io.berkel.dependencyinjection.setter;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beansSetter.xml");
        Foo foo = (Foo) context.getBean("foo");
        System.out.println(foo.getBar1());
        context.close();

    }

}
