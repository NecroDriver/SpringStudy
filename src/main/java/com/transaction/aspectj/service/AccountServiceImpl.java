package com.transaction.aspectj.service;


import com.transaction.aspectj.dao.AccountDao;

/**
 * @author mafh
 * @create 2017-07-10 14:45
 * Created With Intellij IDEA
 */
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
//        int i = 1/0;
        accountDao.inMoney(in, money);
    }
}
