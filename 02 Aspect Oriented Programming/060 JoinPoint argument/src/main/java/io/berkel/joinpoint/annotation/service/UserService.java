package io.berkel.joinpoint.annotation.service;

public class UserService {

    public void someUserService(int a, int b) {
        System.out.println("Executing someUserService");
    }

    public void anotherUserService(int a, int b, int c) {
        System.out.println("Executing anotherUserService");
    }

}
