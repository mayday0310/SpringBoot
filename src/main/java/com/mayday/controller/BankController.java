package com.mayday.controller;

import com.mayday.service.BankService;
import com.mayday.util.JsonUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

/**
 * 银行控制层
 */
@RestController
public class BankController {

    @Autowired
    private BankService bankService;

    @RequestMapping(value="/index")
    public String index(){
        return "bank";
    }

    @RequestMapping("/bankQuery")
    @ResponseBody
    public String getBalance(HttpServletResponse response,String cardNumber){
        Double balance=bankService.getBalance("62279205947481841");
        System.out.println("balance"+balance);
        //将得到的结果响应到前端
        return "余额为:"+balance;
       /* JsonUtils.PrintJson(balance,response);

        return "bankQuery";*/

    }

     @RequestMapping(value="/addBalance")
     @ResponseBody
    public String AddBalance(HttpServletResponse response,String cardNumber,Double money){
       boolean flag= bankService.addBalance("62279205947481841",24.00);
       if(flag){
           return "存款成功";
       }else {
           return "存款失败";
       }

    }
}
