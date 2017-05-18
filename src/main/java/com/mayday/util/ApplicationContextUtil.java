package com.mayday.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * 定时器service注入工具类
 * 因为定时器的执行要优先于注入
 */
@Component
public class ApplicationContextUtil implements ApplicationContextAware{

    private static ApplicationContext applicationContext;

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }


    public  void setApplicationContext(ApplicationContext applicationContext) {
        ApplicationContextUtil.applicationContext = applicationContext;
    }

    public static Object getBean(String BeanName){
        return applicationContext.getBean(BeanName);
    }
}
