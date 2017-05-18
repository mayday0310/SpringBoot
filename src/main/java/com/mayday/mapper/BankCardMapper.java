package com.mayday.mapper;

/**
 * 银行卡映射接口
 */
public interface BankCardMapper {
    //根据卡号查询余额
    public Double getBalance(String cardNumber);

    //存款
    public void addBalance(String cardNumber, Double money);


}
