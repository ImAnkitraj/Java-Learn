package com.tekion.spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {

    @Pointcut("execution(* com.tekion.spring.aop.repository.*.*(..))")
    public void dataLayerExecution() {
    }

    @Pointcut("execution(* com.tekion.spring.aop.service.*.*(..))")
    public void businessLayerExecution() {}

    @Pointcut("bean(*dao*)")
    public  void beanContainingDao() {
        System.out.println("bean containig dao");
    }

    @Pointcut("within(com.tekion.spring.aop.repository..*)")
    public void dataLayerExecutionWithin(){}

    @Pointcut("@annotation(com.tekion.spring.aop.aspect.TrackTime)")
    public void trackTimeAnnotation(){}
}
