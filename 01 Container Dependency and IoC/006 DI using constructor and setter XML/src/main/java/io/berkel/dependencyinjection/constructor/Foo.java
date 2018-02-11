package io.berkel.dependencyinjection.constructor;

public class Foo {

    private Bar1 bar1;
    private Bar2 bar2;

    public Foo(Bar1 bar1, Bar2 bar2) {
        this.bar1 = bar1;
        this.bar2 = bar2;
    }

    public Bar1 getBar1() {
        return bar1;
    }
}
