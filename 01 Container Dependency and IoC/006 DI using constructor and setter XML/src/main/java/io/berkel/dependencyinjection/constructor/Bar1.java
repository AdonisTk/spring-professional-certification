package io.berkel.dependencyinjection.constructor;

public class Bar1 {

    private int var1;
    private String var2;

    public Bar1(int var1, String var2) {
        this.var1 = var1;
        this.var2 = var2;
    }

    @Override
    public String toString() {
        return "Bar1{" +
                "var1=" + var1 +
                ", var2='" + var2 + '\'' +
                '}';
    }

}
