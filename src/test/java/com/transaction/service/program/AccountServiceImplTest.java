package com.transaction.service.program;

import com.transaction.program.service.AccountService;
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
@ContextConfiguration("classpath:spring/spring-transaction-program.xml")
public class AccountServiceImplTest {
    @Resource(name = "accountService")
    private AccountService accountService;
    @Test
    public void transfer() throws Exception {
        accountService.transfer("bbb","aaa",200d);
    }

}