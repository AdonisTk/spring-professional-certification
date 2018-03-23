package io.berkel.dependencyinjection.setter;

import org.springframework.beans.factory.annotation.Autowired;

public class Foo {

    private Bar1 bar1;
    private Bar2 bar2;

    @Autowired
    public void setBar1(Bar1 bar1) {
        this.bar1 = bar1;
    }

    public Bar2 getBar2() {
        return bar2;
    }

    @Autowired
    public void setBar2(Bar2 bar2) {
        this.bar2 = bar2;
    }

    public Bar1 getBar1() {
        return bar1;
    }

}
