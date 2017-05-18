package com.mayday.ehcache;

import javassist.NotFoundException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by EricAi on 2017/5/18.
 */
@RestController
public class EhcacheInfoController {

    @Resource
    private EhcacheInfoService ehcacheInfoService;

    @RequestMapping("/ehcachetest")
    public String test(){

        //存入两条数据.
        EhcacheInfo ehcacheInfo = new EhcacheInfo();
        ehcacheInfo.setName("张三");
        ehcacheInfo.setPwd("123456");
        EhcacheInfo ehcacheInfo2 = ehcacheInfoService.save(ehcacheInfo);

        //不走缓存.
        System.out.println(ehcacheInfoService.findById(ehcacheInfo2.getId()));
        //走缓存.
        System.out.println(ehcacheInfoService.findById(ehcacheInfo2.getId()));


        ehcacheInfo = new EhcacheInfo();
        ehcacheInfo.setName("李四");
        ehcacheInfo.setPwd("123456");
        EhcacheInfo ehcacheInfo3 = ehcacheInfoService.save(ehcacheInfo);

        //不走缓存.
        System.out.println(ehcacheInfoService.findById(ehcacheInfo3.getId()));
        //走缓存.
        System.out.println(ehcacheInfoService.findById(ehcacheInfo3.getId()));

        System.out.println("============修改数据=====================");
        //修改数据.
        EhcacheInfo updated = new EhcacheInfo();
        updated.setName("李四-updated");
        updated.setPwd("123456");
        updated.setId(ehcacheInfo3.getId());
        try {
            System.out.println(ehcacheInfoService.update(updated));
        } catch (NotFoundException e) {
            e.printStackTrace();
        }

        //不走缓存.
        System.out.println(ehcacheInfoService.findById(updated.getId()));

        return "ok";
    }


}