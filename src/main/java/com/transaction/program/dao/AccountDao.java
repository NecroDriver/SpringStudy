package com.transaction.program.dao;

/**
 * @author mafh
 * @create 2017-07-10 14:47
 * Created With Intellij IDEA
 *转账案例的DAO层接口
 */
public interface AccountDao {
    /**
     *
     * @param out 转出账号
     * @param money 转出金额
     */
    public void outMoney(String out, Double money);

    /**
     *
     * @param in 转入账号
     * @param money 转入金额
     */
    public void inMoney(String in, Double money);
}
