package com.imooc.aop.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author mafh
 * @create 2017-07-10 12:59
 * Created With Intellij IDEA
 */
@Component
@Aspect
public class MoocAspect {
    @Pointcut("execution(* com.imooc.aop.aspectj.biz.*Biz.*(..))")
    public void pointcut(){}

    @Pointcut("within(com.imooc.aop.aspectj.biz.*)")
    public void bizPointcut(){}

//    @Before("execution(* com.imooc.aop.aspectj.biz.*Biz.*(..))")
    @Before("pointcut()")
    public void before(){
        System.out.println("MoocAspect before(..)");
    }

    @Before("pointcut()&&args(arg)")
    public void beforeWithParam(String arg){
        System.out.println("beforeWithParam:"+arg);
    }

    @Before("pointcut()&&@annotation(moocMethodValue)")
    public void beforeWithAnnotation(MoocMethod moocMethodValue){
        System.out.println("beforeWithParam:"+moocMethodValue.value());
    }

    @AfterReturning(pointcut = "bizPointcut()",returning = "returnValue")
    public void afterReturning(Object returnValue){
        System.out.println("afterReturning:"+returnValue);
    }

    @AfterThrowing(pointcut = "pointcut()",throwing = "e")
    public void afterThrowing(Exception e){
        System.out.println("afterThrowing:"+e.getMessage());
    }

    @After("pointcut()")
    public void after(){
        System.out.println("MoocAspect after(..)");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around1.");
        Object obj = pjp.proceed();
        System.out.println("around2.");
        return obj;
    }
}
