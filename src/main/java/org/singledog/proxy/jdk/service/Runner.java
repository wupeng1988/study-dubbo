package org.singledog.proxy.jdk.service;

/**
 * @author wupeng
 * @version 1.0
 * @date 2016-02-19
 * @modify
 * @copyright Navi Tsp
 */
public interface Runner {

    void beforeRun();

    void run();

    void afterRun();

}
