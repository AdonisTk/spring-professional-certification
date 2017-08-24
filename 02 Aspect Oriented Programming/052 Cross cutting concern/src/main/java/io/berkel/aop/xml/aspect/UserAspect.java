package io.berkel.aop.xml.aspect;

public class UserAspect {

    public void userBeforeAdvice(){
        System.out.println("Find my advice before user service xml configuration.");
    }

    public void userAfterAdvice(){
        System.out.println("Find my advice after user service xml configuration.");
    }

}
