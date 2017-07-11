package com.transaction.service.aspectj;

import com.transaction.aspectj.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author mafh
 * @create 2017-07-10 15:24
 * Created With Intellij IDEA
 * spring的声明式事务管理的方式二：基于AspectJ的XML方式的配置。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-transaction-aspectj.xml")
public class AccountServiceImplTest {
    /**
     * 注入代理类：因为代理类进行了增强的操作。
     */
    @Resource(name = "accountService")
    private AccountService accountService;
    @Test
    public void transfer() throws Exception {
        accountService.transfer("aaa","bbb",200d);
    }

}