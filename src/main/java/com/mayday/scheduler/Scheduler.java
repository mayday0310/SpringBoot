/*
package com.mayday.scheduler;

import com.mayday.service.BankService;
import com.mayday.util.ApplicationContextUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {



    @Scheduled(cron = "0/30 * * * * ?")  //这里用到了cron表达式
    public void schedule (){

        BankService bankService=(BankService) ApplicationContextUtil.getBean("BankService");
        Double money=bankService.getBalance("62279205947481841");
        if(money>100000){  //如果金额大于十万 ，那么提醒
            System.out.println("超额提醒..当前余额为:"+money);
        }
    }

}
*/
