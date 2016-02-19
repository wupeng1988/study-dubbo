package org.singledog.proxy.jdk.service;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-19
 * @modify
 * @copyright Navi Tsp
 */
public class RunnerImpl implements Runner{
    @Override
    public void beforeRun() {
        System.out.println("before running.....");
    }

    @Override
    public void run() {
        System.out.println("running.....");
    }

    @Override
    public void afterRun() {
        System.out.println("after running.....");
    }
}
