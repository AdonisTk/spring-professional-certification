package io.berkel.qualifier.model;

import org.springframework.stereotype.Component;

@Component(value = "deer")
public class Deer implements Animal {

    @Override
    public void printName() {
        System.out.println("Deer");
    }

}
