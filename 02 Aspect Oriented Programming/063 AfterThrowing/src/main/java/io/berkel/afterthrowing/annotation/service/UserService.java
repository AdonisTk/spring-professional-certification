package io.berkel.afterthrowing.annotation.service;

public class UserService {

    public void someUserService() throws Exception {
        System.out.println("Starting service");
        throw new Exception("An exception thrown");
    }

}
