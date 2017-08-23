package io.berkel.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class UserAspect {

    @Before("execution(* io.berkel.aop.service.*.*(..))")
    public void userBeforeAdvice(){
        System.out.println("find my advice before your task.");
    }

    @After("execution(* io.berkel.aop.service.*.*(..))")
    public void userAfterAdvice(){
        System.out.println("find my advice after your task.");
    }

}
