package io.berkel.afterthrowing.annotation.aspect;

import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class UserAspect {

    @Pointcut("execution(* io.berkel.afterthrowing.annotation.service.*.*(..))")
    private void pointcut(){}

    @AfterThrowing(pointcut = "pointcut()", throwing = "exception")
    public void adviceForExceptionThrowing(Exception exception) throws Throwable {
        System.out.println("###### " + exception.getMessage() + " ######");
    }

}
