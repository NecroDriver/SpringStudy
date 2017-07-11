package com.imooc.aop.aspectj;

import com.imooc.aop.aspectj.biz.MoocBiz;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author mafh
 * @create 2017-07-10 13:13
 * Created With Intellij IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-aop-aspectj.xml")
public class TestAspectj {
    @Resource
    private MoocBiz biz;
    @Test
    public void test(){
        biz.save("this is a test");
    }
}
