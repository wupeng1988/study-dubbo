package org.singledog.dubbo.test2.provider;

import com.alibaba.dubbo.config.annotation.Service;
import org.singledog.dubbo.test2.service.DemoService;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-16
 * @modify
 * @copyright Navi Tsp
 */
@Service(version = "1.0")
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
