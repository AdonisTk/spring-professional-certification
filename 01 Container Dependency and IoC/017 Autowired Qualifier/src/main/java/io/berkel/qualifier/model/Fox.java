package io.berkel.qualifier.model;

import org.springframework.stereotype.Component;

@Component(value = "fox")
public class Fox implements Animal {

    @Override
    public void printName() {
        System.out.println("Fox");
    }

}
