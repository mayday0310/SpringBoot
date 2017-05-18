package com.mayday.service;

import com.mayday.mapper.BankCardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 银行服务层
 */
@Service("BankService")
public class BankService {

    @Autowired
    private BankCardMapper bankCardMapper;

    //查询银行卡余额
     public Double getBalance(String cardNumber){
        return bankCardMapper.getBalance(cardNumber);
     }
     //存款
     public boolean addBalance(String cardNumer,Double money){

         try {
             bankCardMapper.addBalance(cardNumer, money);
             return true;
         } catch (Exception e) {
             e.printStackTrace();
             return false;
         }

     }


}
