package io.berkel.properties.test;

import io.berkel.properties.config.PropertiesWithJavaConfig;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { PropertiesWithJavaConfig.class }, loader = AnnotationConfigContextLoader.class)
public class PropertiesWithJavaConfigTest {

    @Autowired
    private Environment env;

    @Value("${key.something}")
    private String injectedProperty;

    @Test
    public final void givenContextIsInitialized_thenNoException() {
        System.out.println("in test via @Value: " + injectedProperty);
        System.out.println("in test Environment: " + env.getProperty("key.something"));
    }


}
