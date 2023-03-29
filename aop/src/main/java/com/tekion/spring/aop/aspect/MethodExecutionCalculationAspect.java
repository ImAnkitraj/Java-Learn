package com.tekion.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class MethodExecutionCalculationAspect {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Around("com.tekion.spring.aop.aspect.CommonJoinPointConfig.trackTimeAnnotation()")
    public void aroundAspect(ProceedingJoinPoint joinPoint) throws Throwable {

        long startTime = System.currentTimeMillis();
        logger.info("from around aspect - {} ",joinPoint.proceed());
        long timeTaken = System.currentTimeMillis() - startTime;
        logger.info("time taken by {} is {} ", joinPoint, timeTaken);
    }
}
