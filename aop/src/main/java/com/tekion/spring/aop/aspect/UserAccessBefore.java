package com.tekion.spring.aop.aspect;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class UserAccessBefore {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    //Point cut
    @Before("com.tekion.spring.aop.aspect.CommonJoinPointConfig.dataLayerExecution()")
    public void before(JoinPoint joinPoint) {

        //Advice
        logger.info("Check for access");
        logger.info("Intercepted a method call - {}", joinPoint);
    }
}
