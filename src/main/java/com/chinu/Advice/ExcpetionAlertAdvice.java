package com.chinu.Advice;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Slf4j
@Component
public class ExcpetionAlertAdvice {
    @AfterThrowing(value = "execution(* com.chinu.COntroller.ProductController.*(..)) ",throwing = "exception")

    public void  cap(JoinPoint joinPoint,Exception exception){
        log.error("Exception occurs in {}",joinPoint.getSignature());
        log.error("Exception message is {}",exception.getMessage());
    }
}
