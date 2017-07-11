package com.imooc.aop.schema.advice;

/**
 * @author mafh
 * @create 2017-07-06 12:54
 * Created With Intellij IDEA
 */
public class FitImpl implements Fit{
    @Override
    public void filter() {
        System.out.println("FitImpl filter.");
    }
}
