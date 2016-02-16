package org.singledog.dubbo.test2.consumer;

import org.singledog.dubbo.test1.service.DemoService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-16
 * @modify
 * @copyright Navi Tsp
 */
public class DemoClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("client2.xml");
        ClientComponent client = context.getBean(ClientComponent.class);
        client.test();

    }

}
