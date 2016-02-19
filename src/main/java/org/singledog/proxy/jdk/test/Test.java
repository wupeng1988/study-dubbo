package org.singledog.proxy.jdk.test;

import org.singledog.proxy.jdk.service.MyInvocationHandler;
import org.singledog.proxy.jdk.service.Runner;
import org.singledog.proxy.jdk.service.RunnerImpl;

import java.lang.reflect.Proxy;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-19
 * @modify
 * @copyright Navi Tsp
 */
public class Test {

    public static void main(String[] args) {
        Runner runner = (Runner) Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{Runner.class}, new MyInvocationHandler(new RunnerImpl()));
        System.out.println(">>>>>>>");
        runner.beforeRun();
        System.out.println(">>>>>>>");
        runner.run();
        System.out.println(">>>>>>>");
        runner.afterRun();
    }

}
