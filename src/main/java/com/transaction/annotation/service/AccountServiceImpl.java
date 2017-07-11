package com.transaction.annotation.service;


import com.transaction.annotation.dao.AccountDao;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author mafh
 * @create 2017-07-10 14:45
 * Created With Intellij IDEA
 */
@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    /**
     * @param out   :转出账号
     * @param in    :转入账号
     * @param money :转账金额
     */
    @Override
    public void transfer(String out,String in,Double money) {
        accountDao.outMoney(out, money);
        int i = 1/0;
        accountDao.inMoney(in, money);
    }
}
