package io.berkel.proceedingjoinpoint.annotation.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.Arrays;

@Aspect
public class UserAspect {

    @Pointcut("execution(* io.berkel.proceedingjoinpoint.annotation.service.*.*(..))")
    private void pointcut(){}

    @Around("pointcut()")
    public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("Before"); // will print "Before" before the execution of printSomething()
        pjp.proceed();
        System.out.println("After");
    }

}
