package com.mayday.Quartz;

import com.mayday.service.BankService;
import com.mayday.util.ApplicationContextUtil;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;


public class ScheduledJob implements Job {


    private SimpleDateFormat dateFormat() {
        return new SimpleDateFormat("HH:mm:ss");
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        //具体的执行方法 ，这里可以条用需要执行的实体类
       BankService bankService=(BankService) ApplicationContextUtil.getBean("BankService");
       Double money=bankService.getBalance("62279205947481841");

       if(money>100000){
           System.out.println("超额提醒..当前余额为:"+money);
       }

        System.out.println("AAAA: The time is now " + dateFormat().format(new Date()));

    }
}