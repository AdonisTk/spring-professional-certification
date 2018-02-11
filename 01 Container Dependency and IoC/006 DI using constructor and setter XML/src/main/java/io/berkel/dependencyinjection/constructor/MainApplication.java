package io.berkel.dependencyinjection.constructor;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beansConstructor.xml");
        Foo foo = (Foo) context.getBean("foo");
        System.out.println(foo.getBar1());
        context.close();

    }

}
