package org.singledog.dubbo.test2.consumer;

import com.alibaba.dubbo.config.annotation.Reference;
import org.singledog.dubbo.test2.service.DemoService;
import org.springframework.stereotype.Component;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-16
 * @modify
 * @copyright Navi Tsp
 */
@Component
public class ClientComponent {

    @Reference(version = "1.0")
    private DemoService service;

    public void test() {
        service.hello();
        service.hello("WW");
        System.out.println(service.introduction("me", "dubbo"));
    }

}
