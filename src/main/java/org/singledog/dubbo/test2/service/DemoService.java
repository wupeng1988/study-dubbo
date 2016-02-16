package org.singledog.dubbo.test2.service;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-16
 * @modify
 * @copyright Navi Tsp
 */
public interface DemoService {

    void hello();

    void hello(String name);

    String introduction(String myName, String yourName);
}
