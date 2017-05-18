package com.mayday;

import org.springframework.boot.builder.SpringApplicationBuilder;



/**
 * Title: ServletInitializer
 * Description: 相当于整个Web.xml
 * Company: blog.csdn.net/lu1005287365/
 * @author  L lulu
 * @version 1.0
 */
public class ServletInitializer {



    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(Application.class);
    }


}