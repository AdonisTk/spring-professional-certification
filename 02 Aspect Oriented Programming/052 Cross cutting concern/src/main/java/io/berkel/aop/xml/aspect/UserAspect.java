package io.berkel.aop.xml.aspect;

public class UserAspect {

    public void userBeforeAdvice(){
        System.out.println("Find my advice before user service.");
    }

    public void userAfterAdvice(){
        System.out.println("Find my advice after user service.");
    }

}
