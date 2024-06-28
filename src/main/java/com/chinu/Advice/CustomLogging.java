package com.chinu.Advice;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class CustomLogging {
    @Around(value = "execution(* com.chinu.COntroller.ProductController.*(..)) ")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("==============before start========");
        log.info("execution started {}",proceedingJoinPoint.getSignature());
        log.info("Request Body is {}",new ObjectMapper().writeValueAsString(proceedingJoinPoint.getArgs()));
        System.out.println("==============before end========");

        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("==============after start========");

        log.info("execution ended {}",proceedingJoinPoint.getSignature());
        log.info("Response Bosy is {}",new ObjectMapper().writeValueAsString(proceed));
        System.out.println("===============after end========");

        return proceed;

    }
    @Around(value = "execution(* com.chinu.*.*.*(..)) ")
    public Object op(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long l = System.currentTimeMillis();
        Object proceed = proceedingJoinPoint.proceed();

        long l1 = System.currentTimeMillis();

        log.info("{} method of {} takes time to finish {}",proceedingJoinPoint.getSignature().getName(),proceedingJoinPoint.getSignature(),(l1-l));
        return proceed;
    }


}
