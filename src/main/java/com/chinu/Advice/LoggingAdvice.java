//package com.chinu.Advice;
//
//import com.fasterxml.jackson.core.JsonProcessingException;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.annotation.After;
//import org.aspectj.lang.annotation.AfterReturning;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//
//@Aspect
//@Component
//@Slf4j
//public class LoggingAdvice {
//    @Before(value = "execution(* com.chinu.COntroller.ProductController.*(..)) || execution(* com.chinu.Service.ProductService.*(..))"  )
//    public void logRequest(JoinPoint joinPoint) throws JsonProcessingException {
//        log.info("class name {} method name {}",joinPoint.getTarget(),joinPoint.getSignature().getName());
//        log.info("Request body {}",new ObjectMapper().writeValueAsString(joinPoint.getArgs()));
//    }
//    @AfterReturning(value = "execution(* com.chinu.COntroller.ProductController.*(..)) || execution(* com.chinu.Service.ProductService.*(..))"  )
//    public void logResponseRet(JoinPoint joinPoint) throws JsonProcessingException {
//        log.info("class name {} method name {}",joinPoint.getTarget(),joinPoint.getSignature().getName());
//        log.info("Request body {}",new ObjectMapper().writeValueAsString(joinPoint.getArgs()));
//    }
//    @After(value = "execution(* com.chinu.COntroller.ProductController.*(..)) || execution(* com.chinu.Service.ProductService.*(..))"  )
//    public void logResponse(JoinPoint joinPoint) throws JsonProcessingException {
//        log.info("class name {} method name {}",joinPoint.getTarget(),joinPoint.getSignature().getName());
//        log.info("Request body {}",new ObjectMapper().writeValueAsString(joinPoint.getArgs()));
//    }
//
//
//}
