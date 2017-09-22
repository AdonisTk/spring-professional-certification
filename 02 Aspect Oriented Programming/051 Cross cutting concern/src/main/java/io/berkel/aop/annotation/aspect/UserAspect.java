package io.berkel.aop.annotation.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UserAspect {

    @Before("execution(* io.berkel.aop.annotation.service.*.*(..))")
    public void userBeforeAdvice(){
        System.out.println("Find my advice before user service.");
    }

    @After("execution(* io.berkel.aop.annotation.service.*.*(..))")
    public void userAfterAdvice(){
        System.out.println("Find my advice after user service.");
    }

}
