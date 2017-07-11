package com.transaction.annotation.service;

/**
 * @author mafh
 * @create 2017-07-10 14:43
 * Created With Intellij IDEA
 * 转账案例的业务层接口
 */
public interface AccountService {
    /**
     * @param out:转出账号
     * @param in:转入账号
     * @param money:转账金额
     */
    public void transfer(String out, String in, Double money);
}
