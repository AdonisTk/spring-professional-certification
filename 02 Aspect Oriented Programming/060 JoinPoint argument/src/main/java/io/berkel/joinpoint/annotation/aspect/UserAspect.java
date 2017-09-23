package io.berkel.joinpoint.annotation.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.Arrays;

@Aspect
public class UserAspect {

    @Before("execution(* io.berkel.joinpoint.annotation.service.*.*(..))")
    public void userBeforeAdvice(JoinPoint jp){
        MethodSignature signature = (MethodSignature) jp.getSignature();
        System.out.println("From the @Before of the aspect, advised method parameters: " + Arrays.asList(signature.getParameterNames()));

    }

}
