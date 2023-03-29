package com.tekion.spring.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessAfter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //Point cut
    @AfterReturning(value = "com.tekion.spring.aop.aspect.CommonJoinPointConfig.businessLayerExecution()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {

        //Advice
        logger.info("{} returned with value - {}", joinPoint, result);
    }

    @AfterThrowing(value = "com.tekion.spring.aop.aspect.CommonJoinPointConfig.businessLayerExecution()", throwing = "exception")
    public void afterThrow(JoinPoint joinPoint, Object exception) {

        //Advice
        logger.info("{} throwing exception - {}", joinPoint, exception);
    }

    @After(value = "com.tekion.spring.aop.aspect.CommonJoinPointConfig.businessLayerExecution()")
    public void after(JoinPoint joinPoint) {
        logger.info("After {}", joinPoint);
    }
}
