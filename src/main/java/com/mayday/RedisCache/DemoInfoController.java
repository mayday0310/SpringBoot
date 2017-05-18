/*
package com.mayday.RedisCache;

import com.mayday.model.BankCardModel;
import com.mayday.service.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoInfoController {

    @Autowired
    BankService bankService;


    @RequestMapping("/test")
    @ResponseBody
    public String test() {

        Double balance = bankService.getBalance("62279205947481841");

        System.out.println("loaded=" + balance);

        Double cacheBalance = bankService.getBalance("62279205947481841");

        System.out.println("cached=" + cacheBalance);

        Double loaded = bankService.getBalance("62279205947481841");

        System.out.println("loaded2=" + loaded);

        return "ok";

    }


*/
/*
    @RequestMapping("/delete")
    @ResponseBody
    public String delete(long id) {

        demoInfoService.deleteFromCache(id);

        return "ok";

    }


    @RequestMapping("/test1")

    public @ResponseBody
    String test1() {

        demoInfoService.test();

        System.out.println("DemoInfoController.test1()");

        return "ok";

    }

*//*




}
*/
