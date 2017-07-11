package com.transaction.service.declare;

import com.transaction.declare.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author mafh
 * @create 2017-07-10 15:24
 * Created With Intellij IDEA
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-transaction-declare.xml")
public class AccountServiceImplTest {
    /**
     * 注入代理类：因为代理类进行了增强的操作。
     */
//    @Resource(name = "accountService")
    @Resource(name = "accountServiceProxy")
    private AccountService accountService;
    @Test
    public void transfer() throws Exception {
        accountService.transfer("aaa","bbb",200d);
    }

}