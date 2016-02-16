package org.singledog.dubbo.test1.provider;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-16
 * @modify
 * @copyright Navi Tsp
 */
public class StartServer {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("provider1.xml");
        while(true) {}
    }

}
