package com.imooc.aop.schema.advice;

import com.imooc.aop.schema.advice.biz.AspectBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author mafh
 * @create 2017-07-06 14:32
 * Created With Intellij IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-aop-schema-advice.xml")
public class FitImplTest {
    @Resource
    private AspectBiz aspectBiz;
    @Test
    public void filter() throws Exception {
        Fit fit = (Fit)aspectBiz;
        fit.filter();
    }

}