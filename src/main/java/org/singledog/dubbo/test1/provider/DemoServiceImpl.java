package org.singledog.dubbo.test1.provider;

import org.singledog.dubbo.test1.service.DemoService;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-16
 * @modify
 * @copyright Navi Tsp
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public void hello() {
        System.out.println("Hello World !");
    }

    @Override
    public void hello(String name) {
        System.out.println("Hello " + name + " !");
    }

    @Override
    public String introduction(String myName, String yourName) {
        return "Hello, I am " + myName + ", Nice to meet you " + yourName + " !";
    }
}
