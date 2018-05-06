package io.berkel.pointcut.annotation.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserAspect {

    @Pointcut("execution(* io.berkel.pointcut.annotation.service.*.*(..))")
    public void ourFirstPointcut(){
    }

    @Before("ourFirstPointcut()")
    public void userBeforeAdvice(){
        System.out.println("Find my advice before user service.");
    }

    @After("ourFirstPointcut()")
    public void userAfterAdvice(){
        System.out.println("Find my advice after user service.");
    }

}
