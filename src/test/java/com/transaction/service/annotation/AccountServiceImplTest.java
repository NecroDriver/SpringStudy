package com.transaction.service.annotation;

import com.transaction.annotation.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author mafh
 * @create 2017-07-10 15:24
 * Created With Intellij IDEA
 * spring的声明式事务管理的方式三：基于注解方式的配置。
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-transaction-annotation.xml")
public class AccountServiceImplTest {
    @Resource(name = "accountService")
    private AccountService accountService;

    /**
     * 转账的案例
     * @throws Exception
     */
    @Test
    public void transfer() throws Exception {
        accountService.transfer("bbb","aaa",200d);
    }

}